package com.gui.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gui.bean.Employee;
import com.gui.mapper.EmployeeMapper;
import com.gui.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> getAll() {
		return employeeMapper.getAll();
	}

	@Override
	public Employee getById(Integer id) {
		return employeeMapper.getById(id);
	}

	@Override
	public void update(Employee employee) {
		employeeMapper.update(employee);
	}

}
