package com.company;

import java.io.PrintStream;

public class Player implements IPerson {

    private IContext context;

    public Player(IContext context) {
        this.context = context;
    }

    public void setName(String name) {
        context.getState().setData(Player.class.getName(), "name", name);
    }

    @Override
    public String getName() {
        return (String)context.getState().getData(Player.class.getName(), "name");
    }

    @Override
    public String getPosition() {
        return (String)context.getState().getData(Player.class.getName(), "position");
    }

    public void move(String position) {
        context.getState().setData(Player.class.getName(), "position", position);
        context.getOut().println(String.format("You are now %s", position));
    }

    @Override
    public void say(PrintStream stream, String string) {
        stream.println(string.format("You: %s", string));
    }

    @Override
    public void onDiscovered(IContext context) {

    }
}
