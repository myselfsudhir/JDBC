package com.te.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.te.bean.EmployeeData;

public class EmployeeDAOJDBCImpl implements EmployeeDAO{
	
	static String dburl="jdbc:mysql://localhost:3306/employee_info";

	@Override
	public EmployeeData getSingleRecord(int id) {
		EmployeeData emp = new EmployeeData();
		try {
			Connection con = DriverManager.getConnection(dburl,"root","root");
			String query = "select * from employeedata where id="+id+";";
			Statement stmt = con.createStatement();
			ResultSet res= stmt.executeQuery(query);
			while(res.next()) {
				emp.setId(res.getInt(1));
				emp.setName(res.getString(2));
				emp.setSalary(res.getInt(3));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return emp;
	}

	@Override
	public void getAllRecords() {
		System.out.println("getting all records through jdbc");
	}

	@Override
	public void insertRecord(EmployeeData a) {
		// TODO Auto-generated method stub
		System.out.println("inserting using jdbc");
		
	}

}
