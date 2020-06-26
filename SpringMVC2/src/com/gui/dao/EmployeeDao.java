package com.gui.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.gui.bean.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Employee> query(){
		
		String sql = "select employee_id employeeId,last_name lastName,salary from employees";
		RowMapper<Employee> mapper = new BeanPropertyRowMapper<>(Employee.class);
		List<Employee> list = jdbcTemplate.query(sql, mapper);
		return list;
		
	}
}
