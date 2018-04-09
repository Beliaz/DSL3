package test.textadventure;

import com.company.IAction;
import com.company.IContext;
import com.company.IState;
import com.company.TextAdventureLevel;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class EnterNameAction implements IAction
{

    @Override
    public String getDescription() {
        return "Enter Name";
    }

    @Override
    public void perform(IContext context) {

        context.getOut().println("Daniel: So, who are you?");

        String name = "";
        while(name.trim().isEmpty())
        {
            context.getOut().print("You: ");

            try {
                name = context.getIn().readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(name.trim().isEmpty())
            {
                context.getOut().println("Daniel: ???");
            }
        }

        context.getState().setData("general", "name", name);

        context.getOut().println(String.format("Daniel: Hello %s, come right in", name));
        context.getOut().println("You are entering the Daniels's house");
    }

    @Override
    public boolean isAvailable(IState state) {
        return state.getData("general", "name") == null;
    }

    public boolean isExplicitAction() {
        return false;
    }
}

public class EnterName extends TextAdventureLevel {

    private List<IAction> actions = new LinkedList<>();

    public void initialize(IContext context)
    {
        super.initialize(context);

        actions.add(new EnterNameAction());
    }

    @Override
    protected List<IAction> getAvailableActions(IContext context) {
        return actions.stream().filter(a -> a.isAvailable(context.getState()))
                .collect(Collectors.toList());
    }

    @Override
    public String getNextLevel(IContext context) {
        return FirstLevel.class.getName();
    }
}
