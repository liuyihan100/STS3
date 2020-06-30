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
import com.gui.bean.Employee;
import com.gui.serviceImpl.EmployeeServiceImpl;
import com.gui.util.PageUtil;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;
	
	@RequestMapping(value = "emps/{pageNum}",method = RequestMethod.GET)
	public String getAll(Map<String,Object> map,@PathVariable("pageNum")Integer pageNum,HttpServletRequest request) {
		PageHelper.startPage(pageNum, 5);
		List<Employee> employees = employeeServiceImpl.getAll();
		PageInfo<Employee> pageInfo = new PageInfo<Employee>(employees, 5);
		String page = PageUtil.toPage(request, pageInfo);
		map.put("employees", employees);
		map.put("page", page);
		System.out.println(request.getContextPath()); //返回项目根目录
		System.out.println(request.getRequestURI()); //返回页面相对于
		System.out.println(request.getRequestURL());
		return "list";
	}
}
