package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PreparedStatementInterface {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class loaded");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		System.out.println("Establshed Connection.....");
		
//		PreparedStatement ps=conn.prepareStatement("insert into student values(?,?)");
//		ps.setInt(1,8);
//		ps.setString(2, "Sangeeta");
//		
//		int count=ps.executeUpdate();
//		
//		if(count>0)
//		{
//			System.out.println("Inserted Succesfully.......");
//		}
//		else {
//			System.out.println("Failed.......");
//		}
		
//		PreparedStatement ps=conn.prepareStatement("update student set studentname=? where idstudent=?");
//		ps.setString(1,"love");
//		ps.setInt(2, 8);
//		
//		int count=ps.executeUpdate();
//		
//		if(count>0)
//		{
//			System.out.println("Update Succesfully.......");
//		}
//		else {
//			System.out.println("Failed.......");
//		}
//		PreparedStatement ps=conn.prepareStatement("delete from  student where idstudent=?");
//		
//		ps.setInt(1, 0);
//		
//		int count=ps.executeUpdate();
//		
//		if(count>0)
//		{
//			System.out.println("Delete Succesfully.......");
//		}
//		else {
//			System.out.println("Failed.......");
//		}
		PreparedStatement ps=conn.prepareStatement("Select * from student");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next())
		{
			int id=rs.getInt("idstudent");
			String name=rs.getString("studentname");
			
			System.out.println(id+" "+name);
		}
		
		conn.close();
	}

}
