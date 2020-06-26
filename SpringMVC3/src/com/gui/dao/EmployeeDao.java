package com.gui.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gui.bean.Department;
import com.gui.bean.Employee;

@Repository
public class EmployeeDao {
	private static Map<Integer, Employee> employees = null;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	static {
		employees = new HashMap<Integer, Employee>();
		employees.put(1001, new Employee(1001,"刘毅晗","1214296156@qq.com",1,new Department(101,"质量部")));
		employees.put(1002, new Employee(1002,"李仕鸿","2241692534@qq.com",1,new Department(102,"安全部")));
		employees.put(1003, new Employee(1003,"刘露","1109061842@qq.com",0,new Department(103,"生产部")));
		employees.put(1004, new Employee(1004,"李伟","9842@qq.com",1,new Department(104,"技术部")));
	}
	
	private static Integer num = 1005;
	
	public void save(Employee employee) {
		if(employee.getId() == null) {
			employee.setId(num++);
		}
		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}
	
	public void remove(Integer id) {
		employees.remove(id);
	}
	
	public Employee get(Integer id) {
		return employees.get(id);
	}
	
	public Collection<Employee> getEmployees(){
		return employees.values();
	}
}
