package com.prm.h2demo.service;

import com.prm.h2demo.beans.Employee;
import com.prm.h2demo.dao.EmployeeDao;

public class EmployeeService {
	
	public Employee saveEmployee(String name, int experience) {

		EmployeeDao empdao = new EmployeeDao();

		Employee emp = new Employee(name,experience);
				
		emp.setId(empdao.saveEmployee(emp));
		
		return emp;
	}

}
