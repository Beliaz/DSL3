import com.company.IContext;
import com.company.ILevel;
import com.company.State;

public class FinalLevel implements ILevel {
    @Override
    public void initialize(IContext context) {
    }

    @Override
    public State run(IContext context) {
        context.getOut().println("final level");
        return State.Finished;
    }

    @Override
    public String getNextLevel(IContext context) {
        return null;
    }
}
