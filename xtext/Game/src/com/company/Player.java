package com.company;

import java.io.PrintStream;

public class Player extends Person {

    private IContext context;

    public Player(IContext context) {
        this.context = context;
    }

    public void move(String newLocation) {
        super.move(newLocation);
        context.getOut().println(String.format("You are now %s", newLocation));
    }

    @Override
    public void say(PrintStream stream, String string) {
        stream.println(string.format("You: %s", string));
    }

    @Override
    public void take(IObject object) {
        super.take(object);
        context.getOut().println(String.format("%s added to inventory", object.getName()));
    }

    @Override
    public IObject use(String name) {
        IObject object = super.use(name);
        context.getOut().println(String.format("Used %s", name));
        return object;
    }
}
