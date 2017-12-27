package src.engines;

import src.engines.algo.Algo1;

public class Arbitrage extends MainEngine {

	public Arbitrage(double value) {
		super(value);
		// TODO Auto-generated constructor stub
	}

	//public double placeArbitrage
	
	public String analyze() {

		String readLogs;
		readLogs = "Logfile";
		return readLogs;

	}

	// kill Switch

	public String useAlgoOne(double value) {

		Algo1 d = new Algo1();

		return d.AlgoOne();

	}

}

