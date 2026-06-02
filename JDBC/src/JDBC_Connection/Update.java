package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded.............");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		System.out.println("Establshied conection...........");
		
		PreparedStatement ps=conn.prepareStatement("update student set studentname=? where idstudent=?");
		ps.setString(1, "Rushi");
		ps.setInt(2, 1);
		int count=ps.executeUpdate();
		
		if(count>0)
		{
			System.out.println("update succesfully.............");
		}
		else {
			System.out.println("update failed.....................");
		}
				
	}

}
