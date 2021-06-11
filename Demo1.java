package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Demo1 {
	public static void main(String[] args) {
		Connection con=null;
		ResultSet res = null;
		Statement stmt = null;
		
		try {
			Driver driver = new Driver();
			DriverManager .registerDriver(driver);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			String dbUrl = "jdbc:mysql://localhost:3306/employee_info?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			stmt = con.createStatement();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		String query = "select * from emp where empid=1;";
		try {
			res=stmt.executeQuery(query);
			while(res.next()) {
				System.out.println(res.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)
					con.close();
				if(stmt!=null)
					stmt.close();
				if(res!=null)
					res.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
