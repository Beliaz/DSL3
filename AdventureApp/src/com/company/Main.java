package com.company;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        System.out.println("working directory: " + Paths.get(".").toAbsolutePath().normalize().toString());

        if(args.length < 2)
        {
            usage();
            return;
        }

        String levelsPath = args[0];
        String startingLevel = args[1];

        System.out.println("levels root path: " + levelsPath);

        IContext context = new Context();

        URL url = new URL("file://" + levelsPath);

        ClassLoader loader = URLClassLoader.newInstance(new URL[]{url}, ClassLoader.getSystemClassLoader());

        try
        {
            ILevel level = (ILevel)Class.forName(startingLevel, true, loader).newInstance();
            level.initialize(context);
            level.run(context);
        }
        catch(ClassNotFoundException e) { System.out.println("error: level not found"); }
        catch(InstantiationException e) { System.out.println("error: could not create level"); }
        catch(IllegalAccessException e) { System.out.println("error: could not access level class");}
    }

    private static void usage() {
        System.out.println("usage: java AdventureApp <levelPath> <startingLevelName>");
    }
}

