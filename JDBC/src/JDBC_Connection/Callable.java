package JDBC_Connection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Callable{

    public static void main(String[] args) throws Exception {

        // 1. Load Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded...");

        // 2. Create Connection
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbc_db",
                "root",
                "root"
        );
        System.out.println("Connection Established...");

        // 3. Call Stored Procedure
        CallableStatement cs = conn.prepareCall("{call getStudents()}");

        // 4. Execute
        ResultSet rs = cs.executeQuery();

        // 5. Process Result
        while (rs.next()) {
            int id = rs.getInt("idstudent");
            String name = rs.getString("studentname");

            System.out.println(id + " " + name);
        }

        // 6. Close connection
        conn.close();
    }
}