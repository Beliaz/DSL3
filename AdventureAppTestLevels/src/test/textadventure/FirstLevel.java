package test.textadventure;

import com.company.*;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class TalkToIvanAction implements IAction
{
    @Override
    public String getDescription() {
        return "Talk to Ivan";
    }

    @Override
    public void perform(IContext context) {
        String name = (String)context.getState().getData("general", "name");
        context.getOut().println(String.format("Ivan: Hi %s, nice to see you!", name));
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
        context.getOut().println("You: I gotta go, see you!");
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

public class FirstLevel extends TextAdventureLevel {
    private List<IAction> actions = new LinkedList<>();

    public void initialize(IContext context)
    {
        super.initialize(context);

        actions.add(new TalkToIvanAction());
        actions.add(new LeaveAction());
    }

    @Override
    protected List<IAction> getAvailableActions(IContext context) {
        return actions.stream().filter(a -> a.isAvailable(context.getState()))
                .collect(Collectors.toList());
    }
}
