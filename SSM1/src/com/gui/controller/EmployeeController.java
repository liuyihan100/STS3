package com.gui.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gui.bean.Department;
import com.gui.bean.Employee;
import com.gui.serviceImpl.DepartmentServiceImpl;
import com.gui.serviceImpl.EmployeeServiceImpl;
import com.gui.util.PageUtil;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@Autowired
	private DepartmentServiceImpl departmentServiceImpl;
	
	@RequestMapping(value = "/emps/{pageNum}",method = RequestMethod.GET)
	public String getAll(Map<String,Object> map,@PathVariable("pageNum")Integer pageNum,HttpServletRequest request) {
		PageHelper.startPage(pageNum, 5);
		List<Employee> employees = employeeServiceImpl.getAll();
		PageInfo<Employee> pageInfo = new PageInfo<Employee>(employees, 5);
		String page = PageUtil.toPage(request, pageInfo);
		map.put("employees", employees);
		map.put("page", page);
		return "list";
	}
	
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	public String toUpdate(@PathVariable("id")Integer id,Map<String,Object> map) {
		List<Department> departments = departmentServiceImpl.getAllDepartment();
		Employee employee = employeeServiceImpl.getById(id);
		map.put("departments", departments);
		map.put("employee", employee);
		
		return "update";
	}
	
	@RequestMapping(value="emp",method=RequestMethod.PUT)
	public String update(Employee employee) {
		employeeServiceImpl.update(employee);
		return "redirect:emps/1";
	}
}
