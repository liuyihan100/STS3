package com.gui.bean;

public class Employee {
	private Integer employee_id;
	private String last_name;
	private Integer salary;
	public Integer getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(Integer employee_id) {
		this.employee_id = employee_id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Employee(Integer employee_id, String last_name, Integer salary) {
		super();
		this.employee_id = employee_id;
		this.last_name = last_name;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", last_name=" + last_name + ", salary=" + salary + "]";
	}
	
}
