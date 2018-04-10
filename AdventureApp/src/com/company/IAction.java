package com.company;

public interface IAction {
    String getDescription();
    void perform(IContext context);
    boolean isAvailable(IState state);
    boolean isExplicitAction();
}
