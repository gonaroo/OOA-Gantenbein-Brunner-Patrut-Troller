package src.user;

public class Kundendetails {

	private String firstname = "";
	private String lastname = "";
	public String fullname = "" ;
	public String username = "";
	public String accountnr = "";

	// Konstruktor
	public void Nutzer(String uname, String fname, String lname, String kontonr) {
		this.username = uname;
		this.firstname = fname;
		this.lastname = lname;
		this.accountnr = kontonr;
		

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String fname) {
		firstname = fname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lname) {
		lastname = lname;
	}

	public String getAccountnr() {
		return accountnr;
	}

	public void setAccountnr(String kontonr) {
		accountnr = kontonr;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String uname) {
		username = uname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname() {
		this.fullname = firstname + lastname;
	}

}