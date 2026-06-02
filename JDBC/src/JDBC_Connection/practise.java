package JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class practise {
	
		static int fact(int n) {
	        if (n == 1) {
	            return 1;
	        }
	        return n * fact(n -1);
	    }

	public static void main(String[] args) throws Exception
	{
		int n=5;
		int result=practise.fact(n);
		System.out.println(result);	
		
	}

}
