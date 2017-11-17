
public class Engine extends Anlage {

	private double value = 0;

	@Override
	public double order() {

		return value * 2;

	}

	public Engine(double value) {

		this.value = value;

	}

}
