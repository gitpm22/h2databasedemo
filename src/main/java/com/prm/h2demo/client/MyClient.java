package com.prm.h2demo.client;

import com.prm.h2demo.beans.Employee;
import com.prm.h2demo.service.EmployeeService;

public class MyClient {

	public static void main(String[] args) {
		
		EmployeeService employeeServ = new EmployeeService();
		
		Employee employee = employeeServ.saveEmployee("Aadya", 6);
		System.out.println("Employee ID: " + employee.getId());
		System.out.println("Employee Name: " + employee.getName());
		System.out.println("Employee Salary: " +employee.getSalary());
		System.out.println("Years of Experience: " + employee.getExperience());
	}

}
