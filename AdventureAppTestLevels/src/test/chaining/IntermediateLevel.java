package test.chaining;

import com.company.IContext;
import com.company.ILevel;

public class IntermediateLevel implements ILevel {
    @Override
    public void initialize(IContext context) {

    }

    @Override
    public void run(IContext context) {
        context.getOut().println("intermediate level");
    }

    @Override
    public String getNextLevel(IContext context) {
        return FinalLevel.class.getName();
    }
}
