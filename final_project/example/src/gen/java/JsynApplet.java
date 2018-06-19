Circuits{
	"circuitA" (

		Sounds
		{
			Oscillator "mySawTooth" (
				output true
				type sawTooth
				min 50.0
				maximum 10.000
				default 300.0
			)

			PassFilter "highPass" (
				output true
				type high
				frequency 5.000
			)

			BandPass "highPass" (
				output false
				lower_frequency 5.000
				upper_frequency 10.000
			)

			Add "A1" (
				output false
			)
			
			Multiply "M1" (
				output true
			)
			
			Divide "D1" (
				output false
			)

		}
		
		Properties
		{	
			"property1" soundX1 propertyName soundX2 propertyName 
			"property2" soundX1 propertyName soundX2 propertyName 
		}
		
		Connections
		{
		}
	)
}

CircuitConnections 
{
	circuitA master
}

Controls
{
	Window "My Synthesizer"
	{
		width 1280
		height 960
	}
	
	Grid "master" {
		Column 1.0
		Row 0.25
		Row 0.50
		Row 0.25
		
		Grid "Global Controls" {
			column 0
			row 0
			
			Column 0.9
			Column 0.1
			Row 1.0
			
			rotaryKnob "Master Volume" (
				column 1
				row 0
				connection (
					type exponential
					value 0.5
					target "master.limiter"
					property "Amplitude"
				)
				
			)
		}
		
		Grid "Circuit A" {
			column 0
			row 1
			
			Column 1.0
			Row 0.5
			Row 0.5
			
			
			Grid "Controls" {
				column 0
				row 0
				
				Column 1.0
				Column 1.0
				Column 1.0
				Row 1.0

				rotaryKnob "OSCI Frequency" (
					column 0
					row 0
					connection (
						type linear
						value 0.5
						target "CircuitA.OSC1"
						property "Frequency"
					)
				)

				rotaryKnob "LAG" (
					column 1
					row 0
					connection (
						type exponential
						value 0.5
						target "CircuitA.LAG"
						property "Input"
					)
				)

				rotaryKnob "HPASS Frequency" (
					column 2
					row 0
					connection (
						type linear
						value 0.5
						target "CircuitA.HPASS"
						property "Frequency"
					)
				)

			}

			
			audioScope "" (
				column 0
				row 1
				
				connection (
					target CircuitA
				)	
			)
		

		}
	}

}
