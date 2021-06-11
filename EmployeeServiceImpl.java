package com.te.employeeservice;

import com.te.bean.EmployeeData;
import com.te.dao.EmployeeDAO;
import com.te.dao.GetDAOImpl;

public class EmployeeServiceImpl implements EmployeeService {
	GetDAOImpl gi = new GetDAOImpl();
	EmployeeDAO dao = gi.getDaoImpl();

	@Override
	public EmployeeData getSingleRecord(int id) {
		if(id<0)
			return null;
		else {
			System.out.println("Service part");
			return dao.getSingleRecord(id);
		}
	}

	@Override
	public void getAllRecords() {
		// TODO Auto-generated method stub
		System.out.println("fetching all records");
		
	}

	@Override
	public void insertRecord(EmployeeData a) {
		// TODO Auto-generated method stub
		System.out.println("inserting the record");
	}

}
