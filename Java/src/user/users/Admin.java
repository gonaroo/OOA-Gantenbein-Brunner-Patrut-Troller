package src.user.users;

import src.engines.PaiRiT;
import src.user.User;

public class Admin extends User {

	public String check(double value) {
		// if address 0 then RTDR

		PaiRiT b = new PaiRiT(value);

		return b.check();
	}
}