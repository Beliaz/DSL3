package com.company;

public interface ILevel {

    void initialize(IContext context);

    State run(IContext context);

    String getNextLevel(IContext context);
}
