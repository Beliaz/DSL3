package test.textadventure;

import com.company.*;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Person implements IPerson
{

    private String name;
    private String position;

    Person(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void say(PrintStream stream, String string) {
        stream.println(String.format("%s: %s", getName(), string));
    }

    @Override
    public void onDiscovered(IContext context) {

    }
}

class TalkToperson_AAction implements IAction
{
    private IPerson person_A;

    TalkToperson_AAction(IPerson person_A) {
        this.person_A = person_A;
    }

    @Override
    public String getDescription() {
        return String.format("Talk to %s", person_A.getName());
    }

    @Override
    public void perform(IContext context) {
        //String name = (String)context.getState().getData(Player.class.getName(), "name");
        //ivan.say(context.getOut(), String.format("Hi %s, nice to see you!", name));
       	person_A.say(context.getOut(), Search for object xyz);
    }

    @Override
    public boolean isAvailable(IState state) {
        return true;
    }

    public boolean isExplicitAction() {
        return false;
    }
}




public class uibk.ac.at.qe.dsl.game.impl.LevelDeclarationImpl@1aae4197 (name: level_1) extends TextAdventureLevel {
    private List<IAction> actions = new LinkedList<>();
    private List<IPerson> persons = new LinkedList<>();

    public void initialize(IContext context)
    {
    	persons.add(new Person(person_A, "On the table"));
    	actions.add(new TalkToperson_AAction(persons.get(0)));

			
		
        

        super.initialize(context);
    }

    @Override
    protected String getDescription(IContext context) {
        return "uibk.ac.at.qe.dsl.game.impl.DescriptionImpl@72285838 (name: Some description)";
    }

    @Override
    protected List<IPerson> getPersons(IContext context) {
        return persons;
    }

    @Override
    protected List<IAction> getAvailableActions(IContext context) {
        return actions.stream().filter(a -> a.isAvailable(context.getState()))
                .collect(Collectors.toList());
    }
    
    @Override
        public String getNextLevel(IContext context) {
            return uibk.ac.at.qe.dsl.game.impl.LevelDeclarationImpl@190b85f5 (name: level_2).class.getName();
        }
}
