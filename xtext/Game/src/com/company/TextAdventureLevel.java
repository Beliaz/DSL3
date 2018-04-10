package com.company;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public abstract class TextAdventureLevel implements ILevel {
    @Override
    public void initialize(IContext context)
    {
        context.player().move(getDescription(context));

        List<IPerson> persons = getPersons(context);

        if(persons.isEmpty()) return;

        context.getOut().println(String.format("There are %d persons here: ", persons.size()));
        context.getOut().println();

        for(IPerson person : persons) {
            context.getOut().println(person.getName());
        }

        for(IPerson person : persons) {
            person.onDiscovered(context);
        }
    }

    private List<IAction> getAvailableActions(IContext context)
    {
        return getActions(context)
                .stream()
                .filter(a -> a.isAvailable(context))
                .collect(Collectors.toList());
    }

    @Override
    public void run(IContext context) {

        context.getOut().println();

        List<IAction> actions = getAvailableActions(context);

        while(context.getState().getGameState() == GameState.Running && !actions.isEmpty()) {

            if(context.levelChangePending())
            {
                context.clearLevelChange();
                break;
            }

            if(actions.size() == 1 && !actions.get(0).isExplicitAction())
            {
                actions.get(0).perform(context);
                actions = getAvailableActions(context);

                context.getOut().println();

                continue;
            }

            context.getOut().println("What do you want to do?");
            context.getOut().println();

            int selection = 1;
            for (IAction action : actions) {
                context.getOut().println(String.format("(%d) %s", selection, action.getDescription()));
                ++selection;
            }

            context.getOut().println();

            selection = -1;
            while(selection < 1 || selection > actions.size())
            {
                context.getOut().print("Choose: ");

                try {
                    selection = Integer.parseInt(context.getIn().readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (NumberFormatException e)
                {
                    context.getOut().println(String.format("Please enter a number between 1 and %d", actions.size()));
                }

                if(selection > actions.size() || selection < 1)
                {
                    context.getOut().println(String.format("Please enter a number between 1 and %d", actions.size()));
                }
            }

            context.getOut().println();

            actions.get(selection - 1).perform(context);
            actions = getAvailableActions(context);

            context.getOut().println();
        }
    }

    @Override
    public String getNextLevel(IContext context) {
        return null;
    }

    protected abstract String getDescription(IContext context);
    protected abstract List<IPerson> getPersons(IContext context);
    protected abstract List<IAction> getActions(IContext context);
}
