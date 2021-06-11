package jdbcdemo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicDelete {
	public static void main(String[] args) {
		try {
			Driver driver  = new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream in = new FileInputStream("properties.properties");
			Properties p = new Properties();
			p.load(in);
			Connection con = DriverManager.getConnection(p.getProperty("dburl"));
			String query = "delete from employeedata where id=?;";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(args[0]));
			int n=stmt.executeUpdate();
			System.out.println(n+" records deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
