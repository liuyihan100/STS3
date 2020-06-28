package com.gui.mapper;

import java.util.List;

import com.gui.bean.Employee;

public interface EmployeeMapper {
	
	public Employee getUserById(Integer id);
	
	public List<Employee> getAll();
	
}
