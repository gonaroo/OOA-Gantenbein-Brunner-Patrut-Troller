package src.anlage;

import src.user.Kunde;

public class Anlage extends Kunde{


	public double value;

	//private double value = 0;x

	public double place(double value) {
		
		if (value == 1) {
			System.out.println("use EngineArbitrage");
		}
		else if(value == 2) {
			System.out.println("use EnginePAIRIT");
		}
		
		// if adress 1 then EngineArbitrage
		// if adress 2 then EnginePaiRiT

		return value * 2;

	}

	public Anlage(double value) {
		this.value = value;

	}

}