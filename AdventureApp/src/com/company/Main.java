package com.company;

import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

    public static void main(String[] args) throws Exception {

        if(args.length < 2)
        {
            usage();
            return;
        }

        String levelsPath = args[0];
        String startingLevel = args[1];

        System.out.println("levels root path: " + levelsPath);

        URL url = new URL("file://" + levelsPath);
        ClassLoader loader = URLClassLoader.newInstance(new URL[]{url}, ClassLoader.getSystemClassLoader());

        IContext context = new Context();
        IState state = context.getState();

        ILevel level = loadLevel(loader, startingLevel, context);
        level.run(context);

        while(state.getGameState() == GameState.Running)
        {
            // load new level if needed
            if(!level.getNextLevel(context).equals(level.getClass().getName()))
            {
                level = loadLevel(loader, level.getNextLevel(context), context);
            }

            level.run(context);
        }

        context.getOut().println(state.getGameState() == GameState.Finished
                ? "Game Won!"
                : "Game Over!");
    }

    private static ILevel loadLevel(ClassLoader loader, String name, IContext context) throws Exception {
        try {
            ILevel level = (ILevel) Class.forName(name, true, loader)
                    .getConstructor()
                    .newInstance();
            
            level.initialize(context);

            return level;
        }
        catch(ClassNotFoundException e) { System.out.println("error: level not found"); }
        catch(InstantiationException e) { System.out.println("error: could not create level"); }
        catch(IllegalAccessException e) { System.out.println("error: could not access level class"); }

        throw new Exception();
    }

    private static void usage() {
        System.out.println("usage: java AdventureApp <levelPath> <startingLevelName>");
    }
}

