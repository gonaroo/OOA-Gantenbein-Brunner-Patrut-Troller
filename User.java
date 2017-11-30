
public class User {
	
	private String email;

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;

	}

	public static void main (String[] args) {
	
		String FirstName;
		FirstName = "Michael";
		
		String LastName;
		LastName = "Gantenbein";
		
	String user;
	user = FirstName + " " + LastName;
	int letters = user.length();
	



	System.out.println(user);
	System.out.println("Zeichenzahl " + letters);
	
	}
}
