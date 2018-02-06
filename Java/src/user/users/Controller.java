package src.user.users;

import src.engines.Arbitrage;
import src.user.User;

public class Controller extends User{

	public String analyze(double value) {
		// if adress0 then ArtDR

		Arbitrage c = new Arbitrage(value);

		return c.analyze();
	}
}