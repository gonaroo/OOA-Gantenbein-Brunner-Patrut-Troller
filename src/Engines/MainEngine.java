
public class MainEngine extends Banlage {

	private double value = 0;

	@Override
	public double place() {

		
		// if adress 1 then EngineArbitrage
		// if adress 2 then EnginePaiRiT

		return value * 2;

	}

	public MainEngine(double value) {

		this.value = value;

	}
}
