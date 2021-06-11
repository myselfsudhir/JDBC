package jdbcdemo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicUpdate {
	public static void main(String[] args) {
		try {
			FileInputStream in = new FileInputStream("properties.properties");
			Properties p = new Properties();
			p.load(in);
			Driver driver =new Driver();
			DriverManager.registerDriver(driver);
			Connection con = DriverManager.getConnection(p.getProperty("dburl"));
			String query = "update employeedata set name=? where id=?;";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, args[0]);
			stmt.setInt(2, Integer.parseInt(args[1]));
			int n=stmt.executeUpdate();
			System.out.println(n+" rows affected");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
