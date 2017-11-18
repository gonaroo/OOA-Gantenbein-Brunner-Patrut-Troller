
public class UserAdmin {

	public String check(double value) {
		// if adress 0 then RTDR

		NewEnginePaiRiT b = new NewEnginePaiRiT(value);

		return b.check();

	}

}
