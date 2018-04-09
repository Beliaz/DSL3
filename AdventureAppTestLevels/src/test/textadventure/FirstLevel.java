package test.textadventure;

import com.company.*;

import java.io.PrintStream;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class TalkToIvanAction implements IAction
{
    private IPerson ivan;

    TalkToIvanAction(IPerson ivan) {
        this.ivan = ivan;
    }

    @Override
    public String getDescription() {
        return String.format("Talk to %s", ivan.getName());
    }

    @Override
    public void perform(IContext context) {
        String name = (String)context.getState().getData(Player.class.getName(), "name");
        ivan.say(context.getOut(), String.format("Hi %s, nice to see you!", name));
    }

    @Override
    public boolean isAvailable(IState state) {
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
        context.player().say(context.getOut(), "I gotta go, see you!");
        context.getState().setGameState(GameState.Finished);
    }

    @Override
    public boolean isAvailable(IState state) {
        return true;
    }

    @Override
    public boolean isExplicitAction() {
        return true;
    }
}

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

public class FirstLevel extends TextAdventureLevel {
    private List<IAction> actions = new LinkedList<>();
    private List<IPerson> persons = new LinkedList<>();

    public void initialize(IContext context)
    {
        persons.add(new Person("Ivan", "sitting on a chair"));
        persons.add(new Person("Daniel", "at the door"));

        actions.add(new TalkToIvanAction(persons.get(0)));
        actions.add(new LeaveAction());

        super.initialize(context);
    }

    @Override
    protected String getDescription(IContext context) {
        return "in Daniel's House";
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
}
