package com.company;

import java.io.PrintStream;

public interface IPerson {
    void setName(String name);

    String getName();
    String getPosition();

    void move(String newLocation);

    void say(PrintStream stream, String string);
    void onDiscovered(IContext context);

    void take(IObject object);
    boolean hasObject(String name);
    IObject use(String name);
}
