package com.mybatis.bean;

public class Employee {
	
	private Integer employeeId;
	
	private String lastName;
	
	private Integer salary;
	
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", lastName=" + lastName + ", salary=" + salary + ", department="
				+ department + "]";
	}

	public Employee(Integer employeeId, String lastName, Integer salary, Department department) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}

	public Employee() {
		super();
	}
	
	
}
