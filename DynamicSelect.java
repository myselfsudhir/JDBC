package jdbcdemo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicSelect {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			FileInputStream fis = new FileInputStream("properties.properties");
			Properties p = new Properties();
			p.load(fis);
			con = DriverManager.getConnection(p.getProperty("dburl"));
			String query = "select * from emp where empid=?;";
			PreparedStatement pstmnt = con.prepareStatement(query);
			pstmnt.setInt(1, Integer.parseInt(args[0]));
			ResultSet rs = pstmnt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getInt("salary"));
				System.out.println(rs.getString("designation"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
