package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {

    public static void main(String[] args) throws Exception {

    	
    	
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver class loaded successfully");
        
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
    
        System.out.println("Connection Succefully.....");
        
        //PreparedStatement ps=conn.prepareStatement("insert into student values(5,'ramesh')");
        PreparedStatement ps=conn.prepareStatement("insert into student values(?,?)");
        ps.setInt(1,7);
        ps.setString(2, "sony");

      
        int i=ps.executeUpdate();
        if(i>0)
        {
            System.out.println("insert quesry succesfully.....");

        }
        else {
        	System.out.println("fail....");
        }
         
    }
    
}