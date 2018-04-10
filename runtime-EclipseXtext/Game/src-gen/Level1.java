package test.textadventure;

import com.company.*;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class TalkToIvanAction implements IAction
{
    private IPerson Ivan;
    private IObject Key;
    int counter;
    private boolean available;

    TalkToIvanAction(IPerson Ivan) {
        this.Ivan = Ivan;
        this.counter = 0;
        this.Key = new Game_Object("Key");

    }

    @Override
    public String getDescription() {
        return String.format("Talk to %s", Ivan.getName());
    }

    @Override
    public void perform(IContext context) {
    	if (context.player().hasObject("Key")) {
    		Ivan.say(context.getOut(), String.format("Congratulations!"));
    		context.changeLevel();
    	} else {
    		String name;
       		switch (counter++) {
       		case 0:
       			name = (String) context.getState().getData(Player.class.getName(), "name");
       			Ivan.say(context.getOut(), String.format("Hi, nice to see you!"));
       			break;
       		case 1:
       			name = (String) context.getState().getData(Player.class.getName(), "name");
       			Ivan.say(context.getOut(), String.format("I need a key to open the Door. Find it!"));
       			break;
       		case 2:
       			name = (String) context.getState().getData(Player.class.getName(), "name");
       			Ivan.say(context.getOut(), String.format("Do you already found the key? Give it to me!"));
       			break;
       		case 3:
       			name = (String) context.getState().getData(Player.class.getName(), "name");
       			Ivan.say(context.getOut(), String.format("I have nothing to say!"));
       			break;
       		default:
       			Ivan.say(context.getOut(), String.format("I have nothing to say!"));
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

class InspectObjectAction implements IAction {

	private IObject obj;
	private Game_Object Key;

	InspectObjectAction(IObject obj) {
		this.obj = obj;
		this.Key = new Game_Object("Key");
	}

	@Override
	public String getDescription() {
		return String.format("Take a look at the %s", obj.getName());
	}

	@Override
	public void perform(IContext context) {
		if (obj.equals(Key)) {
			context.getOut().println(context.player().getName() + ": Oh... a key!");
			context.player().take(Key);
		}
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


public class Level1 extends TextAdventureLevel {
    private List<IAction> actions = new LinkedList<>();
    private List<IPerson> persons = new LinkedList<>();
    private List<IObject> objects = new LinkedList<>();

    public void initialize(IContext context)
    {
    	persons.add(new Person("Ivan", "at the door"));
    	actions.add(new TalkToIvanAction(persons.get(0)));

		objects.add(new Game_Object("Key"));
		actions.add(new InspectObjectAction(objects.get(0)));

        

        super.initialize(context);
    }

    @Override
    protected String getDescription(IContext context) {
        return "In the entrance room...";
    }

    @Override
    protected List<IPerson> getPersons(IContext context) {
        return persons;
    }

    @Override
    protected List<IAction> getActions(IContext context) {
        return actions;
    }
    
    @Override
        public String getNextLevel(IContext context) {
            return Level1.class.getName();
        }
}
