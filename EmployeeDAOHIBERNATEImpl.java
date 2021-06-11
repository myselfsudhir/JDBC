package com.te.dao;

import com.te.bean.EmployeeData;

public class EmployeeDAOHIBERNATEImpl implements EmployeeDAO {

	@Override
	public EmployeeData getSingleRecord(int id) {
		System.out.println("using hibernate get single record");
		return null;
	}

	@Override
	public void getAllRecords() {
		// TODO Auto-generated method stub
		System.out.println("using hibernate getAllRecords");
		
	}

	@Override
	public void insertRecord(EmployeeData a) {
		// TODO Auto-generated method stub
		System.out.println("using hibernate inserting records");
		
	}

}
