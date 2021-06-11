package com.te.employeeservice;

import com.te.bean.EmployeeData;

public class MainService {
	public static void main(String[] args) {
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		EmployeeData emp= esi.getSingleRecord(5);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
	}
}
