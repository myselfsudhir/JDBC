package jdbcdemo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicInsert {
	public static void main(String[] args) {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream in = new FileInputStream("properties.properties");
			Properties  p = new Properties();
			p.load(in);
			Connection con = DriverManager.getConnection(p.getProperty("dburl"));
			String query = "insert into employeedata values(?,?,?);";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setInt(3, Integer.parseInt(args[2]));
			int n = stmt.executeUpdate();
			System.out.println(n+" rows affected");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
