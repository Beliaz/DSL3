package test.textadventure;

import com.company.*;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class TalkToDanielAction implements IAction
{
    private IPerson Daniel;
    private IObject Bread;
    int counter;
    private boolean available;

    TalkToDanielAction(IPerson Daniel) {
        this.Daniel = Daniel;
        this.counter = 0;
        this.Bread = new Game_Object("Bread");

    }

    @Override
    public String getDescription() {
        return String.format("Talk to %s", Daniel.getName());
    }

    @Override
    public void perform(IContext context) {
	if (context.player().hasObject("Bread")) {
		Daniel.say(context.getOut(), String.format("Congratulations!"));
		context.changeLevel();
	} else {
    		String name;
       		switch (counter++) {
       		case 0:
       			name = (String) context.getState().getData(Player.class.getName(), "name");
       			Daniel.say(context.getOut(), String.format("I am hungry"));
       			break;
       		default:
       			Daniel.say(context.getOut(), String.format("I have nothing to say!"));
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
class TalkToMarkusAction implements IAction
{
    private IPerson Markus;
    int counter;
    private boolean available;

    TalkToMarkusAction(IPerson Markus) {
        this.Markus = Markus;
        this.counter = 0;

    }

    @Override
    public String getDescription() {
        return String.format("Talk to %s", Markus.getName());
    }

    @Override
    public void perform(IContext context) {
	if (ture) {
    		String name;
       		switch (counter++) {
       		case 0:
       			name = (String) context.getState().getData(Player.class.getName(), "name");
       			Markus.say(context.getOut(), String.format("Hi! The kitchen is closed"));
       			break;
       		default:
       			Markus.say(context.getOut(), String.format("I have nothing to say!"));
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
	private Game_Object Bread;

	InspectObjectAction(IObject obj) {
		this.obj = obj;
		this.Bread = new Game_Object("Bread");
	}

	@Override
	public String getDescription() {
		return String.format("Take a look at the %s", obj.getName());
	}

	@Override
	public void perform(IContext context) {
		if (obj.equals(Bread)) {
			context.getOut().println(context.player().getName() + ": Oh... maybe i can give it to Daniel");
			context.player().take(Bread);
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


public class Level2 extends TextAdventureLevel {
    private List<IAction> actions = new LinkedList<>();
    private List<IPerson> persons = new LinkedList<>();
    private List<IObject> objects = new LinkedList<>();

    public void initialize(IContext context)
    {
    	persons.add(new Person("Daniel", "near the kitchen"));
    	actions.add(new TalkToDanielAction(persons.get(0)));
    	persons.add(new Person("Markus", "in the kitchen"));
    	actions.add(new TalkToMarkusAction(persons.get(1)));

		objects.add(new Game_Object("Bread"));
		actions.add(new InspectObjectAction(objects.get(0)));
		objects.add(new Game_Object("Pen"));
		objects.add(new Game_Object("Book"));

        

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
    
}
