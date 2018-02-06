package src.user.users;

import src.anlage.Anlage;
import src.api.RealTimeDataReport;
import src.api.rtd.*;
import src.user.User;

public class Kunde extends User {

	// muss double sein, weil von Anlage importiert!!
	public double place(int value) {
		// if address 0 then RTDR

		// or
		Anlage a = new Anlage(value);
		// NewEngineArbitrage
		// XOR
		// NewEnginePaiRiT

		return a.place(value);
	}

	public int order(int o) {
		return o;
	}

	public String read() {

		RealTimeDataReport r = new RealTimeDataReport();
		return r.RTD();
	}
}