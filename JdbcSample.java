package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

import com.mysql.jdbc.Driver;

public class JdbcSample {
	public static void main(String[] args)  {
		Connection con=null;
		Statement stmnt=null;
		ResultSet result= null;
		// load and register driver

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// get connection via driver

		String dburl = "jdbc:mysql://localhost:3306/employee_info?user=root&password=root";
		try {
			con = DriverManager.getConnection(dburl);
			stmnt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String query = "select * from emp;";
		try {
			result = stmnt.executeQuery(query);
			while (result.next()) {
//				System.out.print(result.getInt("empid" )+ " ");
//				System.out.print(result.getString("ename") + " ");
//				System.out.print(result.getString("email")+" ");
//				System.out.print(result.getDate("doj")+" ");
//				System.out.print(result.getLong("mobile")+" ");
//				System.out.print(result.getString("designation")+" ");
//				System.out.print(result.getInt("salary")+" ");
//				System.out.print(result.getString("gender")+" ");
//				System.out.println();

			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(con!=null)
					con.close();
				if(stmnt!=null)
					stmnt.close();
				if(result!=null)
					result.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
}
