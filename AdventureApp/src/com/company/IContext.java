package com.company;

import java.io.BufferedReader;
import java.io.PrintStream;

public interface IContext {

    PrintStream getOut();
    BufferedReader getIn();

    IState getState();
    Player player();

    void changeLevel();
    boolean levelChangePending();
    void clearLevelChange();
}
