package jdbcdemo;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class Delete {
	public static void main(String[] args)  {
		try {
			FileInputStream in = new FileInputStream("properties.properties");
			Properties p = new Properties();
			p.load(in);
			Connection con = DriverManager.getConnection(p.getProperty("dburl"));
			Statement stmnt = con.createStatement();
			String query = "delete from employeedata where id=2;";
			int n= stmnt.executeUpdate(query);
			
			System.out.println(n+" rows affected");	
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
