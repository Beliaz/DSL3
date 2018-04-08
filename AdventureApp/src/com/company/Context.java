package com.company;

import java.io.PrintStream;

public class Context implements IContext {
    @Override
    public PrintStream getOut() {
        return System.out;
    }

    @Override
    public IState getState() {
        return null;
    }
}
