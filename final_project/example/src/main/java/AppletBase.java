package main.java;

import com.jsyn.JSyn;
import com.jsyn.Synthesizer;
import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.scope.AudioScope;
import com.jsyn.swing.DoubleBoundedRangeModel;
import com.jsyn.swing.PortModelFactory;
import com.jsyn.swing.RotaryTextController;
import com.jsyn.unitgen.LineOut;
import com.jsyn.unitgen.Multiply;
import com.jsyn.unitgen.PassThrough;
import com.jsyn.unitgen.UnitGenerator;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class AppletBase extends JApplet {
    protected Multiply limiter;
    protected LineOut lineOut;
    private Synthesizer synth;
    private PassThrough master;
    private Dictionary<String, CustomCircuit> circuits = new Hashtable<>();

    protected Dictionary<String, CustomCircuit> getCircuits() {
        return circuits;
    }

    protected CustomCircuit getCircuit(String name) {
        return circuits.get(name);
    }

    protected final UnitGenerator getGenerator(String circuitName, String generatorName) {
        return getGenerator(new String[]{circuitName, generatorName});
    }

    protected final UnitGenerator getGenerator(String qualifiedName) {
        return getGenerator(qualifiedName.split("\\."));
    }

    protected final UnitOutputPort getOutputPort(String qualifiedPortName) {
        String[] names = qualifiedPortName.split("\\.");

        UnitGenerator g = getGenerator(Arrays.stream(names).limit(2).toArray(String[]::new));

        return (UnitOutputPort) g.getPortByName(names[2]);
    }

    protected final UnitInputPort getInputPort(String qualifiedPortName) {
        String[] names = qualifiedPortName.split("\\.");

        UnitGenerator g = getGenerator(Arrays.stream(names).limit(2).toArray(String[]::new));

        return (UnitInputPort) g.getPortByName(names[2]);
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

        CustomCircuit c = circuits.get(names[0]);

        if (c == null) throw new AssertionError(String.format("circuit '%s' not found", names[0]));

        UnitGenerator g = c.getGenerators().get(names[1]);

        if (g == null) throw new AssertionError(String.format("generator '%s' not found", names[1]));

        return g;
    }

    protected void add(CustomCircuit circuit) {
        circuits.put(circuit.getName(), circuit);
        synth.add(circuit);
    }

    protected final DoubleBoundedRangeModel createLinearModel(UnitInputPort port) {
        return PortModelFactory.createLinearModel(port);
    }

    protected final DoubleBoundedRangeModel createLinearModel(String qualifiedPortName) {
        String[] names = qualifiedPortName.split("\\.");

        if (names.length != 3)
            throw new AssertionError("qualified name must be of form <circuitName>.<generatorName>.<portName>");

        UnitGenerator g = getGenerator(Arrays.stream(names).limit(2).toArray(String[]::new));

        return createLinearModel(getInputPort(g, names[2]));
    }

    protected final DoubleBoundedRangeModel createExponentialModel(UnitInputPort port) {
        return PortModelFactory.createExponentialModel(port);
    }

    protected final DoubleBoundedRangeModel createExponentialModel(String qualifiedPortName) {
        String[] names = qualifiedPortName.split("\\.");

        if (names.length != 3)
            throw new AssertionError("qualified name must be of form <circuitName>.<generatorName>.<portName>");

        UnitGenerator g = getGenerator(Arrays.stream(names).limit(2).toArray(String[]::new));

        return createExponentialModel(getInputPort(g, names[2]));
    }

    protected final void addKnob(JPanel panel, String label, DoubleBoundedRangeModel model) {
        JPanel knobPanel = new JPanel();

        knobPanel.setLayout(new GridLayout(1, 1));

        RotaryTextController controller = new RotaryTextController(model, 5);
        controller.setTitle(label);

        knobPanel.add(BorderLayout.NORTH, controller);

        panel.add(BorderLayout.NORTH, knobPanel);
    }

    protected final void addWaveView(JPanel panel, UnitOutputPort[] probes) {
        AudioScope scope = new AudioScope(synth);

        for (UnitOutputPort probe : probes) {
            scope.addProbe(probe);
        }

        scope.setTriggerMode(AudioScope.TriggerMode.NORMAL);
        scope.start();

        panel.add(BorderLayout.SOUTH, scope.getView());
    }

    protected final JPanel createHorizontalStackPanel(int columns) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, columns, 10, 10));

        panel.setBorder(BorderFactory.createCompoundBorder());

        return panel;
    }

    protected final JPanel createVerticalStackPanel(int rows) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(rows, 1, 10, 10));
        panel.setBorder(BorderFactory.createCompoundBorder());

        return panel;
    }

    protected void setupOutputMixer() {
        // master pass through
        master = new PassThrough();
        Enumeration<CustomCircuit> e = circuits.elements();
        while (e.hasMoreElements()) {
            CustomCircuit c = e.nextElement();
            master.input.connect(c.output);
        }

        synth.add(master);

        // limiter
        limiter = new Multiply();
        limiter.inputB.set(0.5);
        master.output.connect(limiter.inputA);
        synth.add(limiter);

        // output mixer
        lineOut = new LineOut();
        limiter.output.connect(lineOut.input);
        synth.add(lineOut);
    }

    protected abstract void setupCircuits();

    protected void setupUI() {
        setLayout(new BorderLayout());
    }

    public void init() {
        synth = JSyn.createSynthesizer();

        setupCircuits();

        setupOutputMixer();

        setupUI();

        setupConnections();

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

    protected abstract void setupConnections();
}
