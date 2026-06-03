package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Statement_Interface {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class loaded");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		System.out.println("connection establshied");
		
		Statement statement=conn.createStatement();
		String insertSQL = "INSERT INTO student (idstudent,studentname) VALUES (10, 'Tejas')";
		statement.executeUpdate(insertSQL);
		System.out.println("Insert Successfully");
		
		
		String fetch="Select * from student";
		ResultSet rs=statement.executeQuery(fetch);
		
		while(rs.next())
		{
			int id=rs.getInt("idstudent");
			String name=rs.getString("studentname");
			
			System.out.println(id+" "+" "+name);
		}
        
        // Good practice: Close the statement and connection when done!
        statement.close();
        conn.close();
	}

}
