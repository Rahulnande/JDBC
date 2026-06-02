package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fetch {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		System.out.println("Establshied connection................");
		
		PreparedStatement ps=conn.prepareStatement("Select * from student");
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			String id=rs.getString("idstudent");
			String name=rs.getString("studentname");
			
			System.out.println(id+" "+" "+name);
		}
		conn.close();	
	
	}

}
