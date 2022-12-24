package com.jayant.test;

public class Employee {

	private String name;
	private float age;
	private float salary;
	private Location location;
	private String qualification;
	protected static final String ORGANIZATION_NAME = "Emids";
	
	Employee(String name, float age, float salary, Location location, String qualification){
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.location = location;
		this.qualification = qualification;

	}
	public void raiseSalary(float salary) {
		this.salary = this.salary + salary;
	}
	
	public Location getLocation() {
		return this.location;
	}
	public float getSalary() {
		return this.salary;
	}
	
	public String getOrganizationName() {
		return Employee.ORGANIZATION_NAME;
	}
}
