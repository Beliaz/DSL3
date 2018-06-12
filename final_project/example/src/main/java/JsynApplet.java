package main.java;

import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.swing.JAppletFrame;
import com.jsyn.unitgen.*;

import javax.swing.*;
import java.awt.*;

public class JsynApplet extends AppletBase {

    public static void main(String args[]) {
        JsynApplet applet = new JsynApplet();
        JAppletFrame frame = new JAppletFrame(
                "SawFaders", applet
        );
        frame.setSize(800, 600);
        frame.setVisible(true);
        frame.test();
    }

    @Override
    protected void setupCircuits() {
        // Circuit 1 ===================================================================================================
        {
            // build
            CustomCircuit circuit = new CustomCircuit("Circuit1");

            circuit.add("OSC1", new SineOscillator());
            circuit.add("HPASS", new FilterHighPass());

            circuit.combineOutputs(); // connect outputs of all current elements to circuit output

            circuit.add("OSC2", new SquareOscillator());
            circuit.add("LAG", new LinearRamp());

            add(circuit);

            // configure generators
            UnitGenerator osc1 = getGenerator("Circuit1.OSC1");

            // setup frequency
            UnitInputPort frequencyPort = getInputPort(osc1, UnitGenerator.PORT_NAME_FREQUENCY);
            frequencyPort.setup(50.0, 300.0, 10000.0);

            // lag to smooth out amplitude changes
            UnitGenerator lag = getGenerator("Circuit1.LAG");
            UnitInputPort amplitudePort = getInputPort(osc1, UnitGenerator.PORT_NAME_AMPLITUDE);

            getOutputPort(lag, UnitGenerator.PORT_NAME_OUTPUT).connect(amplitudePort);
            getInputPort(lag, UnitGenerator.PORT_NAME_INPUT).setup(0.0, 0.5, 1);
            getInputPort(lag, UnitGenerator.PORT_NAME_TIME).set(0.2);
        }


        // Circuit 2 ===================================================================================================
        {
            // build
            CustomCircuit circuit2 = new CustomCircuit("Circuit2");

            circuit2.add("OSC3", new SquareOscillator());
            circuit2.add("LPASS", new FilterLowPass());

            circuit2.combineOutputs(); // connect outputs of all current elements to circuit output

            circuit2.add("OSC4", new SawtoothOscillator());
            circuit2.add("LAG", new LinearRamp());

            add(circuit2);

            // configure generators
            UnitGenerator osc3 = getGenerator("Circuit2.OSC3");

            // setup frequency
            UnitInputPort frequencyPort = getInputPort(osc3, UnitGenerator.PORT_NAME_FREQUENCY);
            frequencyPort.setup(50.0, 300.0, 10000.0);

            // lag to smooth out amplitude changes
            UnitGenerator lag = getGenerator("Circuit2.LAG");
            UnitInputPort amplitudePort = getInputPort(osc3, UnitGenerator.PORT_NAME_AMPLITUDE);

            getOutputPort(lag, UnitGenerator.PORT_NAME_OUTPUT).connect(amplitudePort);
            getInputPort(lag, UnitGenerator.PORT_NAME_INPUT).setup(0.0, 0.5, 1);
            getInputPort(lag, UnitGenerator.PORT_NAME_TIME).set(0.2);
        }
    }

    @Override
    protected void setupUI() {
        super.setupUI();

        JPanel globalPanel = createVerticalStackPanel(3);
        JPanel globalControlsPanel = createHorizontalStackPanel(6);
        JPanel circuitsPanel = createHorizontalStackPanel(2);

        globalControlsPanel.add(new Panel());
        globalControlsPanel.add(new Panel());
        globalControlsPanel.add(new Panel());
        globalControlsPanel.add(new Panel());

        addKnob(globalControlsPanel, "Master volume", createExponentialModel(limiter.inputB));

        globalPanel.add(globalControlsPanel);
        globalPanel.add(circuitsPanel);

        JPanel circuitAPanel = createVerticalStackPanel(3);
        JPanel circuitBPanel = createVerticalStackPanel(3);

        circuitsPanel.add(circuitAPanel);
        circuitsPanel.add(circuitBPanel);

        JPanel circuitAKnobPanel = createHorizontalStackPanel(3);
        JPanel circuitBKnobPanel = createHorizontalStackPanel(3);

        circuitAPanel.add(circuitAKnobPanel);
        circuitBPanel.add(circuitBKnobPanel);

        addKnob(circuitAKnobPanel, "OSC1 Frequency", createLinearModel("Circuit1.OSC1.Frequency"));
        addKnob(circuitAKnobPanel, "LAG Input", createExponentialModel("Circuit1.LAG.Input"));
        addKnob(circuitAKnobPanel, "HPASS Frequency", createLinearModel("Circuit1.HPASS.Frequency"));

        addKnob(circuitBKnobPanel, "OSC3 Frequency", createLinearModel("Circuit2.OSC3.Frequency"));
        addKnob(circuitBKnobPanel, "LAG Input", createExponentialModel("Circuit2.LAG.Input"));
        addKnob(circuitBKnobPanel, "LPASS Frequency", createLinearModel("Circuit2.LPASS.Frequency"));

        addWaveView(circuitAPanel, new UnitOutputPort[]{getCircuit("Circuit1").output});
        addWaveView(circuitBPanel, new UnitOutputPort[]{getCircuit("Circuit2").output});

        addWaveView(globalPanel, new UnitOutputPort[]{limiter.output});

        //EnvelopeEditorBox box = new EnvelopeEditorBox();
        //box.setPoints(new EnvelopePoints());
        //circuitAPanel.add(box);

        add(globalPanel);
    }

    @Override
    protected void setupConnections() {
        {
            UnitOutputPort oscOut = getOutputPort("Circuit1.OSC2.Output");
            UnitInputPort filterIn = getInputPort("Circuit1.HPASS.Input");
            oscOut.connect(filterIn);
        }

        {
            UnitOutputPort oscOut = getOutputPort("Circuit2.OSC4.Output");
            UnitInputPort filterIn = getInputPort("Circuit2.LPASS.Input");
            oscOut.connect(filterIn);
        }
    }
}
