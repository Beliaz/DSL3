/*
 * generated by Xtext 2.13.0
 */
package uibk.ac.at.qe.dsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import uibk.ac.at.qe.dsl.game.Scene
import uibk.ac.at.qe.dsl.game.Person
import uibk.ac.at.qe.dsl.game.Action_P
import uibk.ac.at.qe.dsl.game.Action_O
import uibk.ac.at.qe.dsl.game.LevelDefinition
import uibk.ac.at.qe.dsl.game.My_Object

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class GameGenerator extends AbstractGenerator {

	/*
	 * Main generate function
	 */
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		for (scene : resource.allContents.toIterable.filter(Scene)) {
			generateScene(resource, fsa, context, scene)
		}
	}
	
	/*
	 * For each scene the level files are generated
	 */
	def generateScene (Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, Scene scene) {
		for (definition : scene.definitions) {
			fsa.generateFile(definition.name.name + '.java', generateFiles(resource, fsa, context, definition))
		}
	}
	
	/*
	 * Creates a level by calling the necessary functions
	 */
	def generateFiles(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context, LevelDefinition level) {
		return '''
		package test.generated;
		
		import com.company.*;
		
		import java.io.PrintStream;
		import java.util.LinkedList;
		import java.util.List;
		import java.util.stream.Collectors;
		
		�FOR person : level.persons�
			�IF person.action.equals(Action_P::TALK)�
				�generateActionTalk(person, level)�
			�ENDIF�
		�ENDFOR�
		
		�FOR object : level.objects�
			�IF object.action.equals(Action_O::USE)�
				�generateActionUse(level, object)�
			�ELSEIF object.action.equals(Action_O::INSPECT)�
				�generateActionInspect(level, object)�
			�ENDIF�
		�ENDFOR�

		
		�generateLevel(level)�
		'''
	}
	
	/*-----------------------------Actions------------------------------- */
	
	/*
	 * Talk to a person action
	 */
	def generateActionTalk(Person person, LevelDefinition level) {
		return '''
		class TalkTo�person.name�Action implements IAction
		{
		    private IPerson �person.name�;
		    �IF person.finalObject !== null�
		    	private IObject �person.finalObject.name�;
		    �ENDIF�
		    int counter;
		    private boolean available;
		
		    TalkTo�person.name�Action(IPerson �person.name�) {
		        this.�person.name� = �person.name�;
		        this.counter = 0;
		        �IF person.finalObject !== null�
		        	this.�person.finalObject.name� = new Game_Object("�person.finalObject.name�");
		        �ENDIF�

		    }
		
		    @Override
		    public String getDescription() {
		        return String.format("Talk to %s", �person.name�.getName());
		    }
		
		    @Override
		    public void perform(IContext context) {
			�IF person.finalObject !== null�
				if (context.player().hasObject("�person.finalObject.name�")) {
					�person.name�.say(context.getOut(), String.format("Congratulations!"));
					�IF level.next === null�
						context.getState().setGameState(GameState.Finished);
					�ENDIF�
					context.changeLevel();
					
				} else {
			�ELSE�
				if (true) {
			�ENDIF�
		    		String name;
		       		switch (counter++) {
		       		�var i = 0�
		       		�FOR answer : person.response�
		       			case �i++�:
		       				name = (String) context.getState().getData(Player.class.getName(), "name");
		       				�person.name�.say(context.getOut(), String.format("�answer.item�"));
		       				break;
		       		�ENDFOR�
		       		default:
		       			�person.name�.say(context.getOut(), String.format("I have nothing to say!"));
		       			break;
		       		}
		       	}
		    }
		
		    @Override
		    public boolean isAvailable(IContext state) {
		        return true;
		    }
		
		    public boolean isExplicitAction() {
		        return false;
		    }
		}
		'''
	}
	
	/*
	 * Leave action (go to next level)
	 */
	def generateActionLeave() {
		return '''
		class LeaveAction implements IAction
		{
		    @Override
		    public String getDescription() {
		        return "Leave";
		    }
		
		    @Override
		    public void perform(IContext context) {
		        //context.player().say(context.getOut(), "I gotta go, see you!");
		        context.getState().setGameState(GameState.Finished);
		    }
		
		    @Override
		    public boolean isAvailable(IContext state) {
		        return true;
		    }
		
		    @Override
		    public boolean isExplicitAction() {
		        return true;
		    }
		}
		'''
	}
	
	/*
	 * Inspect action (user inspects an object and takes it)
	 */
	def generateActionInspect(LevelDefinition level, My_Object o) {
		return '''
		class InspectObject�o.name�Action implements IAction {
		
			private IObject obj;
			�FOR object : level.objects�
				�IF object.action.equals(Action_O::INSPECT)�
					private Game_Object �object.name�;
				�ENDIF�
			�ENDFOR�
		
			InspectObject�o.name�Action(IObject obj) {
				this.obj = obj;
				�FOR object : level.objects�
					�IF object.action.equals(Action_O::INSPECT)�
						this.�object.name� = new Game_Object("�object.name�");
					�ENDIF�
				�ENDFOR�
			}
		
			@Override
			public String getDescription() {
				return String.format("Take a look at the %s", obj.getName());
			}
		
			@Override
			public void perform(IContext context) {
				�FOR object : level.objects�
					�IF object.action.equals(Action_O::INSPECT)�
						if (obj.equals(�object.name�)) {
							context.getOut().println(context.player().getName() + ": �object.response�");
							context.player().take(�object.name�);
						}
					�ENDIF�
				�ENDFOR�
				else {
					context.getOut().println(
							context.player().getName() + ": This is a nice " + obj.getName() + ", but i can't use it!");
				}
			}
		
			@Override
			public boolean isAvailable(IContext state) {
				return true;
			}
		
			public boolean isExplicitAction() {
				return false;
			}
		}
		'''
	}
	
	/*
	 * Use action
	 */
	def generateActionUse(LevelDefinition level, My_Object o) {
		return '''
		class UseObject�o.name�Action implements IAction {
		
			private IObject obj;
			�FOR object : level.objects�
				�IF object.action.equals(Action_O::USE)�
					private Game_Object �object.name�;
				�ENDIF�
			�ENDFOR�
		
			UseObject�o.name�Action(IObject obj) {
				this.obj = obj;
				�FOR object : level.objects�
					�IF object.action.equals(Action_O::USE)�
						this.�object.name� = new Game_Object("�object.name�");
					�ENDIF�
				�ENDFOR�
			}
		
			@Override
			public String getDescription() {
				return String.format("Take a look at the %s", obj.getName());
			}
		
			@Override
			public void perform(IContext context) {
				�FOR object : level.objects�
					�IF object.action.equals(Action_O::USE)�
						if (obj.equals(�object.name�)) {
							context.getOut().println(context.player().getName() + ": �object.response�");
						}
					�ENDIF�
				�ENDFOR�
				else {
					context.getOut().println(
							context.player().getName() + ": This is a nice " + obj.getName() + ", but i can't use it!");
				}
			}
		
			@Override
			public boolean isAvailable(IContext state) {
				return true;
			}
		
			public boolean isExplicitAction() {
				return false;
			}
		}
		'''
	}
	
	/*-----------------------------Main class for a level------------------------------- */
	
	/*
	 * Creates the main class for a level
	 */
	
	def generateLevel (LevelDefinition level) {
		return '''
		public class �level.name.name� extends TextAdventureLevel {
		    private List<IAction> actions = new LinkedList<>();
		    private List<IPerson> persons = new LinkedList<>();
		    private List<IObject> objects = new LinkedList<>();
		
		    public void initialize(IContext context)
		    {
		    	�var i = 0�
		    	�FOR person : level.persons�
		    		 persons.add(new Person("�person.name�", "�person.position�"));
		    		 �IF person.action.equals(Action_P::TALK)�
		    		 	actions.add(new TalkTo�person.name�Action(persons.get(�i++�)));
		    		 �ENDIF�
		    	�ENDFOR�
		
				�{i = 0; ""}�
				�FOR object : level.objects�
					objects.add(new Game_Object("�object.name�"));
					�IF object.action.equals(Action_O::USE)�
						actions.add(new UseObject�object.name�Action(objects.get(�i++�)));
					�ELSEIF object.action.equals(Action_O::INSPECT)�
						actions.add(new InspectObject�object.name�Action(objects.get(�i++�)));
					�ENDIF�
				�ENDFOR�

		        
		
		        super.initialize(context);
		    }
		
		    @Override
		    protected String getDescription(IContext context) {
		        return "�level.description.name�";
		    }
		
		    @Override
		    protected List<IPerson> getPersons(IContext context) {
		        return persons;
		    }
		
		    @Override
		    protected List<IAction> getActions(IContext context) {
		        return actions;
		    }
		    
		    �IF level.next !== null�
		    @Override
		        public String getNextLevel(IContext context) {
		            return �level.next.name�.class.getName();
		        }
		    �ENDIF�
		}
		'''
	}
}
