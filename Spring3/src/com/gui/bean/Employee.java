package com.gui.bean;

public class Employee {
	
	private int employeeId;
	
	private String lastName;
	
	private int salary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

	public Employee(int employeeId, String lastName, int salary) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Employee() {
		super();
	}
}
