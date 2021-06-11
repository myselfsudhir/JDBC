package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectStatic {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement stmnt = null;
		ResultSet res = null;
		
		Employee emp  =new Employee();
		
		String url = "jdbc:mysql://localhost:3306/employee_info";
		con = DriverManager.getConnection(url, "root", "root");
		String query = "select * from employeedata where id=1;";
		stmnt = con.createStatement();
		res = stmnt.executeQuery(query);
		while(res.next()) {
			emp.setEmpId(res.getInt("id"));
			emp.setName(res.getString("name"));
			emp.setSalary(res.getInt("salary"));
		}
		System.out.println("id = "+emp.getEmpId()+" name = "+emp.getName()+" salary = "+emp.getSalary());
	}
}
