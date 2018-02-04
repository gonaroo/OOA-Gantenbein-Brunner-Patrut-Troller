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
         
         con = DriverManager.getConnection( "jdbc:hsqldb:mem:.", "SA", ""); 
         
         stmt = con.createStatement(); 
         result = stmt.executeUpdate("INSERT INTO KUNDEN VALUES (2, timestamp '2090-07-15 00:00:00', 'info@test.com', '0xeXYZ123', 5000, NOW())"); 
         con.commit(); 
      }catch (Exception e) { 
         e.printStackTrace(System.out); 
      } 
      System.out.println(result+" rows effected"); 
      System.out.println("Rows inserted successfully"); 
   } 
} 