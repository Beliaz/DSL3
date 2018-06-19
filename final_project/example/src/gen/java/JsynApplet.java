package gen.java;

import com.jsyn.ports.UnitInputPort;
import com.jsyn.ports.UnitOutputPort;
import com.jsyn.swing.JAppletFrame;
import com.jsyn.unitgen.*;
import main.java.*;

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
		// Circuit CircuitA ===================================================================================================
		{
			// build
			{
				CustomCircuit circuit = new CustomCircuit("CircuitA");
				add(circuit);
				circuit.add("OSC1", new SawtoothOscillator());
				circuit.add("HPASS", new FilterHighPass());
				
				circuit.combineOutputs(); // connect outputs of all current elements to circuit output
				
				circuit.add("OSC2", new SquareOscillator());
				circuit.add("LAG1", new LinearRamp());
				
				
					// setup OSC1
					getInputPort("CircuitA.OSC1.Frequency")
										.setup(50.0, 300.0, 10000.0);
	
				
	
				
					// setup OSC2
					getInputPort("CircuitA.OSC2.Frequency")
										.setup(50.0, 300.0, 10000.0);
	
				
					// setup LAG1
					getInputPort("CircuitA.LAG1.Frequency")
									.setup(0,
							 			            0.5,
										1);
					getInputPort("CircuitA.LAG1.Time")
										.setup(0.2);
	
				
			}
			
			//properties
			
			// connect
			{
				connect("CircuitA.HPASS.Input","CircuitA.OSC2.Output");
				connect("CircuitA.OSC1.Amplitude","CircuitA.LAG1.Output");
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
			CustomGrid GlobalControlsGrid = createBorderedGrid("Global Controls", new double[] { 
			0.9,
			0.1
		}, new double[] { 
			1.0
		 });
		 GlobalControlsGrid.add(createKnob("Master Volume", createExponentialModel("master.limiter.Amplitude")), 1, 0);
		 globalGrid.add(GlobalControlsGrid, 0, 0);
		}
		// Circuit A
		{
			CustomGrid CircuitAGrid = createBorderedGrid("Circuit A", new double[] { 
			1.0
		}, new double[] { 
			0.5,
			0.5
		 });
		 // Controls
		 {
		 	CustomGrid ControlsGrid = createBorderedGrid("Controls", new double[] { 
		 	1.0,
		 	1.0,
		 	1.0
		 }, new double[] { 
		 	1.0
		  });
		 ControlsGrid.add(createKnob("OSC1 Frequency", createLinearModel("CircuitA.OSC1.Frequency")), 0, 0);
		 ControlsGrid.add(createKnob("LAG1", createExponentialModel("CircuitA.LAG1.Input")), 1, 0);
		 ControlsGrid.add(createKnob("HPASS Frequency", createLinearModel("CircuitA.HPASS.Frequency")), 2, 0);
		  	CircuitAGrid.add(ControlsGrid, 0, 0);
		 }
		 CircuitAGrid.add(createWaveView(new UnitOutputPort[]{getOutputPort("CircuitA.Output")}) ,0, 1);
		 globalGrid.add(CircuitAGrid, 0, 1);
		}
	
		// add global grid to root component
		add(globalGrid.getPanel());
	}

	@Override
	protected void setupCircuitConnections() {
		connectCircuit("CircuitA", "master");
	}

}
