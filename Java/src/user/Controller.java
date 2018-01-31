package src.user;

import src.engines.Arbitrage;

public class Controller extends User{

	public String analyze(double value) {
		// if adress0 then ArtDR

		Arbitrage c = new Arbitrage(value);

		return c.analyze();

	}

}
