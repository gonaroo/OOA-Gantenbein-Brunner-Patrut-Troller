
public class Kunde {
	
	private String email;

	public String getEmail() {
		return email;
		
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public double order(double value) {
		// Hier wird irgendetwas gerechnet //
		
		Engine a = new Engine(value);
				
		return a.order();
		
		
	}

}
