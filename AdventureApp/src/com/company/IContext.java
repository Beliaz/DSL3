package com.company;

import java.io.PrintStream;

public interface IContext {

    PrintStream getOut();
    IState getState();
}
