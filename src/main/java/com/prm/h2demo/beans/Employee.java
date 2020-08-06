package com.prm.h2demo.beans;

public class Employee {
	
	private int id = 0;
	private String name;
	private double salary;
	private int experience;
	
	public Employee() {
		
	}
	public Employee(String name, int experience) {
		super();
		this.name = name;
		this.experience = experience;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	

}
