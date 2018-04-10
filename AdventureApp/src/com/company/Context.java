package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Context implements IContext {
    private IState state = new State();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Player player;
    private boolean changeLevel = false;

    public Context() {
        player = new Player(this);
    }

    @Override
    public PrintStream getOut() {
        return System.out;
    }

    @Override
    public BufferedReader getIn() {
        return reader;
    }

    @Override
    public IState getState() {
        return state;
    }

    @Override
    public Player player() {
        return player;
    }

    @Override
    public void changeLevel() {
        changeLevel = true;
    }

    @Override
    public boolean levelChangePending() {
        return changeLevel;
    }

    @Override
    public void clearLevelChange() {
        changeLevel = false;
    }
}
