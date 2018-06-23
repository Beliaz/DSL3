package main.java;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.ports.UnitPort;
import com.jsyn.scope.AudioScope;
import com.jsyn.swing.DoubleBoundedRangeModel;
import com.jsyn.swing.PortModelFactory;
import com.jsyn.swing.RotaryTextController;
import com.jsyn.unitgen.*;

import javax.swing.*;
import java.awt.*;
import java.util.*;

final class MasterCircuit extends CustomCircuit
{
    private Multiply limiter;
    private PassThrough amplitudePassThrough;

    public UnitInputPort amplitude;

    public MasterCircuit() {
        super("master");

        // limiter
        limiter = new Multiply();
        limiter.inputB.set(0.5);
        inputPassThrough.output.connect(limiter.inputA);

        add("limiter", limiter);

        // amplitude
        amplitudePassThrough = new PassThrough();
        amplitudePassThrough.input.setName(UnitGenerator.PORT_NAME_AMPLITUDE);
        amplitudePassThrough.output.connect(limiter.inputB);
        amplitudePassThrough.input.set(0.5);

        addPort(amplitude = amplitudePassThrough.input);

        combineOutputs();
    }
}

public abstract class AppletBase extends JApplet {

    protected LineOut lineOut;
    private Synthesizer synth;

    private Dictionary<String, CustomCircuit> circuits = new Hashtable<>();

    protected Dictionary<String, CustomCircuit> getCircuits() {
        return circuits;
    }

    protected CustomCircuit getCircuit(String name) {
        return circuits.get(name.toLowerCase());
    }

    protected final UnitGenerator getGenerator(String qualifiedName) {
        return getGenerator(qualifiedName.split("\\."));
    }
    protected final UnitPort getPort(String qualifiedPortName)
    {
        String[] names = qualifiedPortName.split("\\.");

        if(names.length < 2)
            throw new AssertionError("qualified name must be of form " +
                    "<circuitName>.<generatorName>.<propertyName> or " +
                    "<circuitName>.<propertyName>");

        CustomCircuit c = getCircuit(names[0]);

        // its a circuit property
        if (names.length == 2)
        {
            return c.getPortByName(names[1]);
        }
        else if(names.length == 3)
        {
            return c.getGenerator(names[1]).getPortByName(names[2]);
        }
        else
        {
            throw new AssertionError("qualified name must be of form " +
                    "<circuitName>.<generatorName>.<propertyName> or " +
                    "<circuitName>.<propertyName>");
        }
    }

    protected final UnitOutputPort getOutputPort(String qualifiedPortName) {
        return (UnitOutputPort) getPort(qualifiedPortName);
    }

    protected final UnitInputPort getInputPort(String qualifiedPortName) {
        return (UnitInputPort) getPort(qualifiedPortName);
    }

    protected final UnitInputPort getInputPort(UnitGenerator g, String portName) {
        UnitInputPort port = (UnitInputPort) g.getPortByName(portName);

        if (port == null)
            throw new AssertionError(String.format("Port '%s' is not an input port", portName));

        return port;
    }

    protected final UnitOutputPort getOutputPort(UnitGenerator g, String portName) {
        UnitOutputPort port = (UnitOutputPort) g.getPortByName(portName);

        if (port == null)
            throw new AssertionError(String.format("Port '%s' is not an input port", portName));

        return port;
    }

    protected final UnitGenerator getGenerator(String[] names) {
        if (names.length != 2) throw new AssertionError("qualified name must be of form <circuitName>.<generatorName>");

        CustomCircuit c = getCircuit(names[0]);

        if (c == null) throw new AssertionError(String.format("circuit '%s' not found", names[0]));

        UnitGenerator g = c.getGenerators().get(names[1].toLowerCase());

        return g;
    }

    protected void add(CustomCircuit circuit) {
        circuits.put(circuit.getName().toLowerCase(), circuit);
        synth.add(circuit);
    }

    protected final DoubleBoundedRangeModel createLinearModel(UnitInputPort port) {
        return PortModelFactory.createLinearModel(port);
    }

    protected final DoubleBoundedRangeModel createLinearModel(String qualifiedPortName) {
        return createLinearModel(getInputPort(qualifiedPortName));
    }

    protected final DoubleBoundedRangeModel createExponentialModel(UnitInputPort port) {
        return PortModelFactory.createExponentialModel(port);
    }

    protected final DoubleBoundedRangeModel createExponentialModel(String qualifiedPortName) {
        return createExponentialModel(getInputPort(qualifiedPortName));
    }

    protected final void connect(UnitInputPort input, UnitOutputPort output)
    {
        input.connect(output);
    }

    protected final void connectCircuit(String outputCircuitName, String inputCircuitName){
        if(!inputCircuitName.toLowerCase().equals("master"))
            throw new RuntimeException("not supported");

        connect(getCircuit(inputCircuitName).input, getCircuit(outputCircuitName).output);
    }

    protected final void connect(String qualifiedInputName, String qualifiedOutputName) {
        getInputPort(qualifiedInputName).connect(getOutputPort(qualifiedOutputName));
    }

    protected final JComponent createKnob(String label, DoubleBoundedRangeModel model) {
        JPanel knobPanel = new JPanel();
        knobPanel.setLayout(new GridLayout(1, 1));
        knobPanel.setMinimumSize(new Dimension(80, 80));
        knobPanel.setMaximumSize(new Dimension(120, 120));

        RotaryTextController controller = new RotaryTextController(model, 5);
        controller.setTitle(label);
        knobPanel.add(BorderLayout.NORTH, controller);

        return knobPanel;
    }

    protected final JComponent createWaveView(UnitOutputPort[] probes) {
        AudioScope scope = new AudioScope(synth);

        for (UnitOutputPort probe : probes) {
            scope.addProbe(probe);
        }

        scope.setTriggerMode(AudioScope.TriggerMode.NORMAL);
        scope.start();

        scope.getView().setMinimumSize(new Dimension(100, 50));

        return scope.getView();
    }

    protected final CustomGrid createGrid() {

        return new CustomGrid();
    }

    protected final CustomGrid createBorderedGrid(String label) {

        CustomGrid grid = createGrid();
        grid.getPanel().setBorder(BorderFactory.createTitledBorder(label));
        return grid;
    }

    protected final CustomGrid createGrid(double[] columnWeights, double[] rowWeights) {

        return new CustomGrid(columnWeights, rowWeights);
    }

    protected final CustomGrid createBorderedGrid(String label, double[] columnWeights, double[] rowWeights) {

        CustomGrid grid = createGrid(columnWeights, rowWeights);
        grid.getPanel().setBorder(BorderFactory.createTitledBorder(label));
        return grid;
    }

    protected void setupOutputMixer() {

        MasterCircuit master = new MasterCircuit();

        // output mixer
        lineOut = new LineOut();
        master.output.connect(lineOut.input);
        synth.add(lineOut);

        add(master);
    }

    protected abstract void setupCircuits();

    protected void setupUI() {
        setLayout(new BorderLayout());
    }

    public void init() {
        synth = JSyn.createSynthesizer();

        setupOutputMixer();

        // Circuits
        setupCircuits();

        // CircuitConnections
        setupCircuitConnections();

        // Controls
        setupUI();

        validate();
    }

    public void start() {
        // start (default stereo output at 44100Hz)
        synth.start();
        // start line out, pulls data from the oscillator
        lineOut.start();
    }

    public void stop() {
        synth.stop();
    }

    protected abstract void setupCircuitConnections();
}
