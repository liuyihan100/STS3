package com.gui.mapper;

import java.util.List;

import com.gui.bean.Employee;

public interface EmployeeMapper {
	
	public Employee getById(Integer id);
	
	public List<Employee> getAll();
	
	public void update(Employee employee);
	
}
