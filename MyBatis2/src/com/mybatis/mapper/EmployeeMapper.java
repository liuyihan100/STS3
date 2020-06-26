package com.mybatis.mapper;

import java.util.List;

import com.mybatis.bean.Employee;

public interface EmployeeMapper {
	
	public List<Employee> getEmployee(Employee employee);
	
	public void delete(List<Integer> employees);
	
	public List<Employee> getAllEmployee();
	
}
