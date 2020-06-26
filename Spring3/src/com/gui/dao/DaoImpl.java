package com.gui.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements DaoI {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int query(int id) {
		
		String sql = "select salary from employees where employee_id = ?";
		Integer result = jdbcTemplate.queryForObject(sql, Integer.class, id);
		
		return result;
	}

	@Override
	public void add(int id) {

		String sql = "update employees set salary = salary + 1000 where employee_id = ?";
		jdbcTemplate.update(sql, id);
		
	}

	@Override
	public void sub(int id) {

		String sql = "update employees set salary = salary - 1000 where employee_id = ?";
		jdbcTemplate.update(sql, id);
		
	}
	
}
