package gen.java;

import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.swing.JAppletFrame;
import com.jsyn.unitgen.*;
import main.java.AppletBase;
import main.java.CustomCircuit;
import main.java.CustomGrid;
import main.java.Cells;

import javax.swing.*;
import java.awt.*;

public class JsynApplet extends AppletBase {

	public static void main(String args[]) {
		JsynApplet applet = new JsynApplet();
		JAppletFrame frame = new JAppletFrame(
		        "My Synthesizer", applet
		);
		frame.setSize(1280, 960);
		frame.setVisible(true);
		frame.test();
	}

	@Override
	protected void setupCircuits() {
		// Circuit circuitA ===================================================================================================
		{
			// build
			{
				CustomCircuit circuit = new CustomCircuit("circuitA");
				add(circuit);
				circuit.add("mySawTooth", new SawtoothOscillator());
				circuit.add("highPass", new FilterHighPass());
				circuit.add("M1", new Multiply();
				
				circuit.combineOutputs(); // connect outputs of all current elements to circuit output
				
				circuit.add("highPass", new FilterBandPass());
				circuit.add("A1", new Add());
				circuit.add("D1", new Divide();
				
				
					// setup mySawTooth
					getInputPort("circuitA.mySawTooth.Frequency")
										.setup(50.0, 300.0, 10.0);
	
				
	
				
	
				
	
				
	
				
	
				
			}
			
			//properties
			
			// connect
			{
				connect("circuitA.sound1.property1","circuitA.sound2.property2");
				connect("circuitA.sound3.property1","circuitA.sound4.property2");
			}
		}
	}

	@Override
	protected void setupUI() {
		super.setupUI();
	
		CustomGrid globalGrid = createGrid(new double[] {
			1.0
		}, new double[] { 
			0.25,
			0.5,
			0.25
		 });

		// Global Controls
		{
			CustomGrid Grid = createBorderedGrid("Global Controls", new double[] { 
			1.0
		}, new double[] { 
			0.25,
			0.5,
			0.25
		 });
		 Grid.add(createKnob("Master Volume", createExponentialModel("master.Amplitude")), 1, 0);
		}
		// Circuit A
		{
			CustomGrid Grid = createBorderedGrid("Circuit A", new double[] { 
			1.0
		}, new double[] { 
			0.25,
			0.5,
			0.25
		 });
		 // Controls
		 {
		 	CustomGrid Grid = createBorderedGrid("Controls", new double[] { 
		 	1.0,
		 	1.0,
		 	1.0
		 }, new double[] { 
		 	1.0
		  });
		 Grid.add(createKnob("OSCI Frequency", createLinearModel("CircuitA.OSC1.Frequency")), 0, 0);
		 Grid.add(createKnob("LAG", createExponentialModel("CircuitA.LAG.Input")), 1, 0);
		 Grid.add(createKnob("HPASS Frequency", createLinearModel("CircuitA.HPASS.Frequency")), 2, 0);
		  	parent.add(Grid, 0, 0)
		 }
		 Grid.add(createWaveView(new UnitOutputPort[]{getOutputPort("CircuitA.Output")}) , 0, 1);
		}
	
		// add global grid to root component
		add(globalGrid.getPanel());
	}

	@Override
	protected void setupCircuitConnections() {
		connectCircuit("circuitA", "circuitB");
		connectCircuit("circuitB", "master");
	}

}
