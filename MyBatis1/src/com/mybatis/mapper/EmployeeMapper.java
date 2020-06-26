package com.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;

import com.mybatis.bean.Department;
import com.mybatis.bean.Employee;

public interface EmployeeMapper {
	
	Employee getUserById(Integer id);
	
	List<Employee> getAll();
	
	Department getDepartment();
	
	@MapKey("employeeId")
	Map<String, Employee> getAllReturnMap();
	
	Integer insert(Employee employee);
	
	Map<String, String> getUserByIdReturnMap(int id);
	
}
