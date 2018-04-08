import com.company.IContext;
import com.company.ILevel;
import com.company.State;

public class StartLevel implements ILevel {
    @Override
    public void initialize(IContext context) {

    }

    @Override
    public State run(IContext context) {
        context.getOut().println("start level");
        return State.Running;
    }

    @Override
    public String getNextLevel(IContext context) {
        return IntermediateLevel.class.getName();
    }
}
