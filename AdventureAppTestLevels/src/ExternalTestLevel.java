import com.company.IContext;
import com.company.ILevel;

public class ExternalTestLevel implements ILevel {
    @Override
    public void initialize(IContext context) {
        context.getOut().println("initializing external test method");
    }

    @Override
    public void run(IContext context) {
        context.getOut().println("running external test method");
    }
}
