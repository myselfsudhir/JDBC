package com.te.employeeservice;

import com.te.bean.EmployeeData;

public interface EmployeeService {
	public EmployeeData getSingleRecord(int id);
	public void getAllRecords();
	public void insertRecord(EmployeeData a);
}
