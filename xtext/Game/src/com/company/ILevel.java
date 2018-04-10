package com.company;

public interface ILevel {

    void initialize(IContext context);

    void run(IContext context);

    String getNextLevel(IContext context);
}
