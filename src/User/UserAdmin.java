
public class UserAdmin extends User{

	public String check(double value) {
		// if address 0 then RTDR

		NewEnginePaiRiT b = new NewEnginePaiRiT(value);

		return b.check();

	}

}
