package com.gui.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.gui.bean.Department;

@Repository
public class DepartmentDao {
	
	private static Map<Integer, Department> departments = null;
	
	static {
		departments = new HashMap<Integer, Department>();
		departments.put(101, new Department(101,"质量部"));
		departments.put(102, new Department(102,"安全部"));
		departments.put(103, new Department(103,"生产部"));
		departments.put(104, new Department(104,"技术部"));
		departments.put(105, new Department(105,"商务部"));
	}
	
	public Collection<Department> getDepartments(){
		return departments.values();
	}
	
	public Department getDepartment(Integer id) {
		return departments.get(id);
	}
}
