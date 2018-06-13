package main.java;

import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.swing.JAppletFrame;
import com.jsyn.unitgen.*;

import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;

public class JsynApplet extends AppletBase {

    public static void main(String args[]) {
        JsynApplet applet = new JsynApplet();
        JAppletFrame frame = new JAppletFrame(
                "Example Program", applet
        );
        frame.setSize(1280, 960);
        frame.setVisible(true);
        frame.test();
    }

    @Override
    protected void setupCircuits() {
        // Circuit 1 ===================================================================================================
        {
            // build
            {
                CustomCircuit circuit = new CustomCircuit("CircuitA");

                circuit.add("OSC1", new SineOscillator());
                circuit.add("HPASS", new FilterHighPass());

                circuit.combineOutputs(); // connect outputs of all current elements to circuit output

                circuit.add("OSC2", new SquareOscillator());
                circuit.add("LAG", new LinearRamp());

                add(circuit);

                // configure generators
                UnitGenerator osc1 = getGenerator("CircuitA.OSC1");

                // setup frequency
                UnitInputPort frequencyPort = getInputPort(osc1, UnitGenerator.PORT_NAME_FREQUENCY);
                frequencyPort.setup(50.0, 300.0, 10000.0);

                // lag to smooth out amplitude changes
                UnitGenerator lag = getGenerator("CircuitA.LAG");
                UnitInputPort amplitudePort = getInputPort(osc1, UnitGenerator.PORT_NAME_AMPLITUDE);


                getInputPort(lag, UnitGenerator.PORT_NAME_INPUT).setup(0.0, 0.5, 1);
                getInputPort(lag, UnitGenerator.PORT_NAME_TIME).set(0.2);
            }

            // connect
            {
                connect("CircuitA.HPASS.Input","CircuitA.OSC2.Output");
                connect("CircuitA.OSC1.Amplitude", "CircuitA.LAG.Output");
            }

        }

        // Circuit 2 ===================================================================================================
        {
            // build
            {
                CustomCircuit circuit2 = new CustomCircuit("CircuitB");

                circuit2.add("OSC3", new SquareOscillator());
                circuit2.add("LPASS", new FilterLowPass());

                circuit2.combineOutputs(); // connect outputs of all current elements to circuit output

                circuit2.add("OSC4", new SawtoothOscillator());
                circuit2.add("LAG", new LinearRamp());

                add(circuit2);

                // configure generators
                UnitGenerator osc3 = getGenerator("CircuitB.OSC3");

                // setup frequency
                UnitInputPort frequencyPort = getInputPort(osc3, UnitGenerator.PORT_NAME_FREQUENCY);
                frequencyPort.setup(50.0, 300.0, 10000.0);

                // lag to smooth out amplitude changes
                UnitGenerator lag = getGenerator("CircuitB.LAG");
                UnitInputPort amplitudePort = getInputPort(osc3, UnitGenerator.PORT_NAME_AMPLITUDE);

                getOutputPort(lag, UnitGenerator.PORT_NAME_OUTPUT).connect(amplitudePort);
                getInputPort(lag, UnitGenerator.PORT_NAME_INPUT).setup(0.0, 0.5, 1);
                getInputPort(lag, UnitGenerator.PORT_NAME_TIME).set(0.2);
            }

            // connect
            {
                connect("CircuitB.OSC3.Amplitude", "CircuitB.LAG.Output");
                connect("CircuitB.LPASS.Input", "CircuitB.OSC4.Output");
            }
        }
    }

    @Override
    protected void setupUI() {
        super.setupUI();

        CustomGrid globalGrid = createGrid(new double[] { 1 }, new double[] { 0.25, 0.5, 0.25 });

        // global controls
        {
            CustomGrid globalControlsGrid = createBorderedGrid("Global Controls", new double[] { 0.9, 0.1 }, new double[] { 1 });
            globalControlsGrid.getPanel().setMinimumSize(new Dimension(100, 50));
            globalControlsGrid.add(new JPanel(), 0, 0);
            globalControlsGrid.add(createKnob("Master volume", createExponentialModel(limiter.inputB)), 1, 0);
            globalGrid.add(globalControlsGrid, 0, 0);

        }

        CustomGrid circuitsPanel = createGrid(new double[]{ 0.5, 0.5 }, new double[]{ 1 });
        globalGrid.add(circuitsPanel, 0, 1);

        // Circuit A
        {
            CustomGrid circuitAPanel = createBorderedGrid("Circuit A", new double[]{ 1 }, new double[]{ 0.5, 0.5 });
            circuitsPanel.add(circuitAPanel, 0, 0);

            CustomGrid circuitAKnobPanel = createGrid(new double[]{ 0.5, 0.5, 0.5 }, new double[]{ 1 });
            circuitAPanel.add(circuitAKnobPanel, 0, 0);

            circuitAKnobPanel.add(createKnob("OSC1 Frequency", createLinearModel("CircuitA.OSC1.Frequency")), 0, 0);
            circuitAKnobPanel.add(createKnob("LAG Input", createExponentialModel("CircuitA.LAG.Input")), 1, 0);
            circuitAKnobPanel.add(createKnob("HPASS Frequency", createLinearModel("CircuitA.HPASS.Frequency")), 2, 0);

            circuitAPanel.add(createWaveView(new UnitOutputPort[]{getCircuit("CircuitA").output}), 0, 1);
        }

        // Circuit B
        {
            CustomGrid circuitBPanel = createBorderedGrid("Circuit B", new double[]{ 1 }, new double[]{ 0.5, 0.5 });
            circuitsPanel.add(circuitBPanel, 1, 0);

            CustomGrid circuitBKnobPanel = createGrid(new double[]{ 0.5, 0.5, 0.5 }, new double[]{ 1 });
            circuitBPanel.add(circuitBKnobPanel, 0, 0);

            circuitBKnobPanel.add(createKnob("OSC3 Frequency", createLinearModel("CircuitB.OSC3.Frequency")), 0, 0);
            circuitBKnobPanel.add(createKnob("LAG Input", createExponentialModel("CircuitB.LAG.Input")), 1, 0);
            circuitBKnobPanel.add(createKnob("LPASS Frequency", createLinearModel("CircuitB.LPASS.Frequency")), 2, 0);

            circuitBPanel.add(createWaveView(new UnitOutputPort[]{getCircuit("CircuitB").output}), 0, 1);
        }

        // master wave view
        CustomGrid masterWaveViewGrid = createBorderedGrid("Master Output Wave View");
        masterWaveViewGrid.add(createWaveView(new UnitOutputPort[]{limiter.output}), 0, 0);
        globalGrid.add(masterWaveViewGrid, 0, 2);

        //EnvelopeEditorBox box = new EnvelopeEditorBox();
        //box.setPoints(new EnvelopePoints());
        //circuitAPanel.add(box);

        add(globalGrid.getPanel());
    }

    @Override
    protected void setupCircuitConnections() {
        connectCircuit("master", "CircuitA");
        connectCircuit("master", "CircuitB");
    }
}
