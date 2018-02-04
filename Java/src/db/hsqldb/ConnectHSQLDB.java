package src.db.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectHSQLDB {
	public static void main(String[] args) {
		Connection connection = null;
		ResultSet resultSet = null;
		Statement statement = null;
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			
			//connection = DriverManager.getConnection("jdbc:hsqldb:file:C:/git/OOA-Gantenbein-Brunner-Patrut-Troller/Java/lib", "SA", "");
			connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/", "SA", "");
			statement = connection.createStatement(); //do not remove this line!!
			// resultSet = statement.executeQuery("CREATE TABLE IF NOT EXISTS KUNDEN ID DECIMAL NOT NULL, DATE TIMESTAMP, EMAIL VARCHAR(24) NOT NULL, WALLET VARCHAR(36) NOT NULL, AMOUNT INT NOT NULL");
			// resultSet = statement.executeQuery("INSERT INTO KUNDEN ID, DATE, EMAIL, WALLET, AMOUNT, VALUES 2, timestamp '2090-07-15 00:00:00', 'info@test.com', '0xeXYZ123', 5000");
			resultSet = statement.executeQuery("SELECT Wallet FROM PUBLIC.KUNDEN WHERE ID='2'");
			
			
			while (resultSet.next()) {
				System.out.println("Customer Wallet:" + resultSet.getString("Wallet"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}