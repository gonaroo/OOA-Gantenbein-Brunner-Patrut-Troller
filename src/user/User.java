package src.user;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Kundendetails n = new Kundendetails();

		System.out.println("Gib deinen Usernamen ein:");
		n.setUsername(scanner.nextLine());

		System.out.println("Dein Vorname:");
		n.setFirstname(scanner.nextLine());

		System.out.println("Dein Nachname:");
		n.setLastname(scanner.nextLine());

		System.out.println("Gib deine Kontonummer ein:");
		n.setAccountnr(scanner.nextLine());

		n.setFullname();

		scanner.close();

		System.out.println(n.username);
		System.out.println(n.fullname);
		System.out.println(n.accountnr);
		System.out.println("Schluss");

	}

}

/*
 * private String email;
 * 
 * public void setEmail(String email) {
 * 
 * this.email = email; }
 * 
 * public String getEmail() { return email;
 * 
 * }
 */
