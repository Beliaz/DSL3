package test.chaining;

import com.company.GameState;
import com.company.IContext;
import com.company.ILevel;
import com.company.State;

public class FinalLevel implements ILevel {
    @Override
    public void initialize(IContext context) {
    }

    @Override
    public void run(IContext context) {
        context.getOut().println("final level");
        context.getState().setGameState(GameState.Finished);
    }

    @Override
    public String getNextLevel(IContext context) {
        return null;
    }
}
