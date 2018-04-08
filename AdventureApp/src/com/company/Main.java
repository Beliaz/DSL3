package com.company;

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

        ILevel level = loadLevel(loader, startingLevel);
        level.initialize(context);

        State gameState = State.Running;

        while(gameState == State.Running)
        {
            level = loadLevel(loader, level.getNextLevel(context));
            level.initialize(context);

            gameState = level.run(context);
        }

        context.getOut().println(gameState == State.Finished
                ? "Game Won!"
                : "Game Over!");
    }

    private static ILevel loadLevel(ClassLoader loader, String name) throws Exception {
        try {
            return (ILevel) Class.forName(name, true, loader).newInstance();
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

