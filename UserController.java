
public class UserController extends User{

	public String analyze(double value) {
		// if adress0 then ArtDR

		NewEngineArbitrage c = new NewEngineArbitrage(value);

		return c.analyze();

	}

}
