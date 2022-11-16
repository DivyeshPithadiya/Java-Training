package JDBC;

import java.sql.*;
public class insertDataInTable {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/cm";
		String username="root";
		String password="";
		Connection c = DriverManager.getConnection(url,username,password);
		
		PreparedStatement s=c.prepareStatement("insert into students values(?,?,?)");
		s.setInt(1, 6);
		s.setString(2,"Surya");
		s.setInt(3, 26);
		
		s.executeUpdate();
		s.close();
		c.close();
		
	}

}
