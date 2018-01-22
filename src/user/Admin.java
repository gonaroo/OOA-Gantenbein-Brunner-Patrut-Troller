package src.user;

import src.engines.PaiRiT;

public class Admin extends User{

	public String check(double value) {
		// if address 0 then RTDR

		PaiRiT b = new PaiRiT(value);

		return b.check();

	}

}
