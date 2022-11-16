package JDBC;

import java.sql.*;
public class ReadDataFromDatabase {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cm";
		String username="root";
		String password="";
		Connection c = DriverManager.getConnection(url,username,password);
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("select * from students");
		
		
		while(r.next()) {
			
			System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));
			
		}
		
		c.close();
	}

}
