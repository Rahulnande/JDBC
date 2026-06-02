package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded.......");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		System.out.println("establshied connection.................");
		
		PreparedStatement ps=conn.prepareStatement("delete from student where idstudent=?");
		ps.setInt(1, 7);
		int count=ps.executeUpdate();
		
		if(count>0)
		{
			System.out.println("delete successfully...............");
		}
		else {
			System.out.println("failed.............");
		}
	}

}
