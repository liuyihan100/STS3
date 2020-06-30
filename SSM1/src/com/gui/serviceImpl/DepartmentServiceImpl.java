package com.gui.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gui.bean.Department;
import com.gui.mapper.DepartmentMapper;
import com.gui.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Override
	public List<Department> getAllDepartment() {
		return departmentMapper.getAll();
	}

}
