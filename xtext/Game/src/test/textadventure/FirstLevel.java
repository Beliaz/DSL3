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
        ivan.say(context.getOut(), String.format("Hi %s, nice to see you!", context.player().getName()));
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
        context.player().say(context.getOut(), "I gotta go, see you!");
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
    protected List<IAction> getActions(IContext context) {
        return actions;
    }
}
