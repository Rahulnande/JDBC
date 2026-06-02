package JDBC_Connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Collable {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class Loaded.......");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		System.out.println("Connection established......");
		
//		CallableStatement cl=conn.prepareCall("insert into student values(?,?)");
//		cl.setInt(1, 8);
//		cl.setString(2,"yedu");
//		
//		int count=cl.executeUpdate();
//		if(count>0)
//		{
//			System.out.println("Inserted Successfully........");
//		}
//		else {
//			System.out.println("Failed.......");
		
//		CallableStatement cl=conn.prepareCall(" update student set idstudent=? where studentname=?");
//		cl.setInt(1, 7);
//		cl.setString(2, "yedu");
//		
//		
//		int count=cl.executeUpdate();
//		if(count>0)
//		{
//			System.out.println("Update Successfully........");
//		}
//		else {
//			System.out.println("Failed.......");
//		}
		
		CallableStatement cl=conn.prepareCall(" select * from student");
		
		ResultSet rs=cl.executeQuery();
		
		
		while(rs.next())
		{
			int id=rs.getInt("idstudent");
			String name=rs.getString("studentname");
			
			System.out.println(id+" "+name);
		}
	}

}
