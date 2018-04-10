package com.company;

import java.io.PrintStream;

public interface IPerson {
    String getName();
    String getPosition();
    void say(PrintStream stream, String string);
    void onDiscovered(IContext context);
}
