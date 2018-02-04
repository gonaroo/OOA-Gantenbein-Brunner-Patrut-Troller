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
			connection = DriverManager.getConnection("jdbc:hsqldb:file:C:/git/OOA-Gantenbein-Brunner-Patrut-Troller/Java/lib", "SA", "");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT Wallet FROM KUNDEN WHERE ID='1'");
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