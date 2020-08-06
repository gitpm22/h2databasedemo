package com.prm.h2demo.dao;

import java.util.Random;

import com.prm.h2demo.beans.Employee;

public class EmployeeDao {

	public int saveEmployee(Employee empObj) {
		
		
		//empObj.setName(empObj.getName());
		
		
		if (empObj.getExperience() > 0 && empObj.getExperience() < 5) {
					
			empObj.setSalary(500000.00);		
		}
		else {
			empObj.setSalary(700000.00);
		}
		
		Random randomNumber = new Random();
		
		int randomId = randomNumber.nextInt(100);
		
		empObj.setId(randomId);
		
		return empObj.getId();

	}

}
