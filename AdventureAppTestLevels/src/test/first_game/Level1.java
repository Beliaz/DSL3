package test.first_game;

import java.util.LinkedList;
import java.util.List;

import com.company.IAction;
import com.company.IContext;
import com.company.IObject;
import com.company.IPerson;
import com.company.IState;
import com.company.Player;
import com.company.TextAdventureLevel;

class MyObject implements IObject {

	private String name;

	public MyObject(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onDiscovered(IContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean equals(IObject other) {
		return other.getName().equals(getName());
	}

}

class TalkToIvanAction implements IAction {
	private IPerson ivan;
	private IObject key;
	int counter;
	private boolean available;

	TalkToIvanAction(IPerson ivan) {
		this.ivan = ivan;
		this.counter = 0;
		this.key = new MyObject("Key");
	}

	@Override
	public String getDescription() {
		return String.format("Talk to %s", ivan.getName());
	}

	@Override
	public void perform(IContext context) {
		if (context.player().hasObject(key)) {
			ivan.say(context.getOut(), String.format("Thank you, now i'll open the door!"));
			context.levelComplete();
		} else {
			switch (counter++) {
			case 0:
				String name = (String) context.getState().getData(Player.class.getName(), "name");
				ivan.say(context.getOut(), String.format("Hi %s, nice to see you!", name));
				break;
			case 1:
				ivan.say(context.getOut(), String.format("I need a key to open the Door. Find it!"));
				break;
			case 2:
				ivan.say(context.getOut(), String.format("Do you already found the key? Give it to me!"));
				break;
			default:
				ivan.say(context.getOut(), String.format("I have nothing to say!"));
				break;
			}
		}
	}

	@Override
	public boolean isAvailable(IState state) {
		return true;
	}

	public boolean isExplicitAction() {
		return false;
	}
}

class InspectObjectAction implements IAction {

	private IObject obj;
	private IObject key;
	private IObject box;

	InspectObjectAction(IObject obj) {
		this.obj = obj;
		this.key = new MyObject("Key");
		this.box = new MyObject("Box");
	}

	@Override
	public String getDescription() {
		return String.format("Take a look at the %s", obj.getName());
	}

	@Override
	public void perform(IContext context) {
		if (obj.equals(box)) {
			context.getOut().println(context.player().getName() + ": Oh... in the box is a key!");
			context.player().inventory().add(key);
		} else {
			context.getOut().println(
					context.player().getName() + ": This is a nice " + obj.getName() + ", but i can't use it!");
		}
	}

	@Override
	public boolean isAvailable(IState state) {
		return true;
	}

	public boolean isExplicitAction() {
		return false;
	}
}

public class Level1 extends TextAdventureLevel {

	private List<IAction> actions = new LinkedList<>();
	private List<IPerson> persons = new LinkedList<>();
	private List<IObject> objects = new LinkedList<>();

	public void initialize(IContext context) {
		objects.add(new MyObject("Desk"));
		objects.add(new MyObject("Box"));
		objects.add(new MyObject("Table"));

		persons.add(new Person("Ivan", "at the door"));

		actions.add(new TalkToIvanAction(persons.get(0)));
		actions.add(new InspectObjectAction(objects.get(0)));
		actions.add(new InspectObjectAction(objects.get(1)));
		actions.add(new InspectObjectAction(objects.get(2)));

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
	protected List<IAction> getAvailableActions(IContext context) {
		return actions;
	}

	@Override
	public String getNextLevel(IContext context) {
		return Level2.class.getName();
	}
}
