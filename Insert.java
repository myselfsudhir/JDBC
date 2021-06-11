package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Insert {
	public static void main(String[] args) throws SQLException {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		String url = "jdbc:mysql://localhost:3306/employee_info";
		Connection con = DriverManager.getConnection(url, "root", "root");
		
		String query = "insert into employeedata values(1,'Mohit',5500);";
		Statement stmnt = con.createStatement();
		
		int n = stmnt.executeUpdate(query);
		System.out.println(n+" rows affected");
		
		if(con!=null)
			con.close();
		if(stmnt!=null)
			stmnt.close();
		
	}
}
