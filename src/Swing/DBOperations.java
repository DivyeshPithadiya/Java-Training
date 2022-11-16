package Swing;

import java.sql.*;

public class DBOperations {
	
	void insertData(String query) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/cm";
			String username="root";
			String password="";
			Connection c=DriverManager.getConnection(url,username,password);
			PreparedStatement p=c.prepareStatement(query);
			p.executeUpdate();
			c.close();
			
			System.out.println("Data inserted");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
