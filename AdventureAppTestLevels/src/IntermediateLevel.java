import com.company.IContext;
import com.company.ILevel;
import com.company.State;

public class IntermediateLevel implements ILevel {
    @Override
    public void initialize(IContext context) {

    }

    @Override
    public State run(IContext context) {
        context.getOut().println("intermediate level");
        return State.Running;
    }

    @Override
    public String getNextLevel(IContext context) {
        return FinalLevel.class.getName();
    }
}
