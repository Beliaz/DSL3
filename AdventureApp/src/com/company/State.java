package com.company;

import java.util.Dictionary;
import java.util.Hashtable;

public class State implements IState {
    private GameState gameState = GameState.Running;
    private Dictionary<String, Dictionary<String, Object>> data = new Hashtable<>();

    @Override
    public GameState getGameState() {
        return gameState;
    }

    @Override
    public void setGameState(GameState state) {
        gameState = state;
    }

    @Override
    public Object getData(String section, String key) {

        if(data.get(section) == null)
        {
            return null;
        }

        return data.get(section).get(key);
    }

    @Override
    public void setData(String section, String key, Object value) {

        if(data.get(section) == null)
        {
            data.put(section, new Hashtable<>());
        }

        data.get(section).put(key, value);
    }


}
