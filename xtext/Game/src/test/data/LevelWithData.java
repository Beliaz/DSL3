package test.data;

import com.company.GameState;
import com.company.IContext;
import com.company.ILevel;

public class LevelWithData implements ILevel {

    private static String counterKey = "counter";

    @Override
    public void initialize(IContext context) {
        context.getState().setData(LevelWithData.class.getName(), counterKey, 10);
    }

    @Override
    public void run(IContext c) {
        int counter = getCounter(c);

        c.getOut().println("counter: " + counter);

        counter -= 1;

        setCounter(c, counter);

        if(counter == 0) c.getState().setGameState(GameState.Finished);
    }

    private int getCounter(IContext c){
        return (int)c.getState().getData(LevelWithData.class.getName(), counterKey);
    }

    private void setCounter(IContext c, int counter){
        c.getState().setData(LevelWithData.class.getName(), counterKey, counter);
    }

    @Override
    public String getNextLevel(IContext context) {
        return LevelWithData.class.getName();
    }
}
