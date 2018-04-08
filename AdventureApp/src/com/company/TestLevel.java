package com.company;

public class TestLevel implements ILevel {
    @Override
    public void initialize(IContext context) {
        context.getOut().println("initializing test level");
    }

    @Override
    public void run(IContext context) {
        context.getOut().println("running test level");
    }
}
