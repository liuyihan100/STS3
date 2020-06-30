package com.gui.service;

import java.util.List;

import com.gui.bean.Employee;

public interface EmployeeService {
	
	public List<Employee> getAll();
	
	public Employee getById(Integer id);
	
	public void update(Employee employee);
	
}
