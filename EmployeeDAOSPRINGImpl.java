package com.te.dao;

import com.te.bean.EmployeeData;

public class EmployeeDAOSPRINGImpl implements EmployeeDAO {

	@Override
	public EmployeeData getSingleRecord(int id) {
		System.out.println("Get record using spring");
		return null;
	}

	@Override
	public void getAllRecords() {
		// TODO Auto-generated method stub
		System.out.println("get all records using spring");
	}

	@Override
	public void insertRecord(EmployeeData a) {
		// TODO Auto-generated method stub
		System.out.println("insert record using spring");
		
	}

}
