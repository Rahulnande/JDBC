package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Statement_Interface {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Class loaded");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		System.out.println("connection establshied");
		
		Statement statement=conn.createStatement();
		String insertSQL = "INSERT INTO student (idstudent,studentname) VALUES (9, 'rohit')";
		statement.executeUpdate(insertSQL);
		System.out.println("Insert Successfully");
        
        // Good practice: Close the statement and connection when done!
        statement.close();
        conn.close();
	}

}
