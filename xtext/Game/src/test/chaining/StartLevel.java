package test.chaining;

import com.company.IContext;
import com.company.ILevel;

public class StartLevel implements ILevel {
    @Override
    public void initialize(IContext context) {

    }

    @Override
    public void run(IContext context) {
        context.getOut().println("start level");
    }

    @Override
    public String getNextLevel(IContext context) {
        return IntermediateLevel.class.getName();
    }
}
