package com.company;

import java.io.PrintStream;

public class Context implements IContext {
    private IState state = new State();

    @Override
    public PrintStream getOut() {
        return System.out;
    }

    @Override
    public IState getState() {
        return state;
    }
}
