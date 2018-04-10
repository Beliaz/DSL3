package com.company;

public interface IAction {
    String getDescription();
    void perform(IContext context);
    boolean isAvailable(IContext state);
    boolean isExplicitAction();
}
