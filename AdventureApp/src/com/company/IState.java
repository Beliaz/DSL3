package com.company;

public interface IState
{
    GameState getGameState();
    void setGameState(GameState state);

    Object getData(String section, String key);
    void setData(String section, String key, Object value);
}
