package src.db.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; 

//InsertQuery
public class HsqlDBmanager {
   public static void main(String[] args) { 
      Connection con = null; 
      Statement stmt = null; 
      int result = 0; 
      try { 
    	  
    	  Class.forName("org.hsqldb.jdbc.JDBCDriver");
    	  
        // Class.forName("org.hsqldb.jdbc.JDBCDriver"); 
        // con = DriverManager.getConnection( "jdbc:hsqldb:hsql://localhost", "SA", ""); 
        // con = DriverManager.getConnection( "jdbc:hsqldb:file:C:/git/OOA-Gantenbein-Brunner-Patrut-Troller/Java/lib", "SA", ""); 
         
         con = DriverManager.getConnection( "jdbc:hsqldb:hsql://localhost/", "SA", ""); 
         
         stmt = con.createStatement(); 
         
         result = stmt.executeUpdate("CREATE TABLE IF NOT EXISTS KUNDEN ID DECIMAL NOT NULL, DATE TIMESTAMP, EMAIL VARCHAR(24) NOT NULL, WALLET VARCHAR(36) NOT NULL, AMOUNT INT NOT NULL");
         result = stmt.executeUpdate("INSERT INTO PUBLIC.KUNDEN VALUES (1, timestamp '2090-07-15 00:00:00', 'info@test.com', '0xeXYZ123', 5000, NOW())"); 
         con.commit(); 
      }catch (Exception e) { 
         e.printStackTrace(System.out); 
      } 
      System.out.println(result+" rows effected"); 
      System.out.println("Rows inserted successfully"); 
   } 
}

//this file is outdated, please use ConnectHSQLDB instead!