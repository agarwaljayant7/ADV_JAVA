package com.jayant.factories;

import com.jayant.dao.EmployeeDao;
import com.jayant.dao.EmployeeDaoImpl;

public class EmployeeDaoFactory {

	private static EmployeeDao daoFactory = null;
	
	static {
		daoFactory = new EmployeeDaoImpl();
	}
	public static EmployeeDao getEmployeeDao() {
		return daoFactory;
	}
}
