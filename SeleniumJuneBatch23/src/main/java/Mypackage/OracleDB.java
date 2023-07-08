package Mypackage;
import java.sql.*;

	 class JDBCTest{
	     public static void main(String args[]) throws SQLException {
	         Connection con = null;
	         try{
	             Class.forName("oracle.jdbc.driver.OracleDriver");
	             String dbURL = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=" + args[0] + ")(PORT=1521))(CONNECT_DATA=(SERVER = DEDICATED)(SERVICE_NAME=orclgg)))";
	             System.out.println("jdbcurl=" + dbURL);
	             String strUserID = "system";
	             String strPassword = "Oracle123";
	             con=DriverManager.getConnection(dbURL,strUserID,strPassword);
	             System.out.println("Connected to the database.");
	             Statement stmt=con.createStatement();
	             System.out.println("Executing query");
	             ResultSet rs=stmt.executeQuery("SELECT 1 FROM DUAL");
	             while(rs.next())
	                 System.out.println(rs.getInt("1"));
	             con.close();
	         }catch(Exception e){ System.out.println(e);}
	         finally {
	             con.close();
	         }
	 }
	 }

