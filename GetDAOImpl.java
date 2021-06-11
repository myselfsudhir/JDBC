package com.te.dao;

public class GetDAOImpl {
	String type="jdbc";
	
	public EmployeeDAO getDaoImpl() {
		if(type.equalsIgnoreCase("jdbc"))
			return new EmployeeDAOJDBCImpl();
		else if(type.equalsIgnoreCase("spring"))
			return new EmployeeDAOSPRINGImpl();
		else if(type.equalsIgnoreCase("hibernate"))
			return new EmployeeDAOHIBERNATEImpl();
		return null;
	}
}
