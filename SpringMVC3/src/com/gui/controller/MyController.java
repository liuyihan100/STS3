package com.gui.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.gui.bean.Department;
import com.gui.bean.Employee;
import com.gui.dao.DepartmentDao;
import com.gui.dao.EmployeeDao;

@Controller
public class MyController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@RequestMapping("emps")
	public String list(Map<String,Object> map) {
		Collection<Employee> employees = employeeDao.getEmployees();
		map.put("emps", employees);
		return "/list";
	}
	
	@RequestMapping(value="emp",method=RequestMethod.GET)
	public String toAdd(Map<String,Object> map) {
		Collection<Department> departments = departmentDao.getDepartments();
		map.put("departments", departments);
		return "/add";
	}
	
	@RequestMapping(value="emp",method=RequestMethod.POST)
	public String add(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
	@RequestMapping(value="emp/{id}",method=RequestMethod.GET)
	public String toUpdate(@PathVariable("id")Integer id,Map<String,Object> map) {
		Employee employee = employeeDao.get(id);
		Collection<Department> departments = departmentDao.getDepartments();
		map.put("employee", employee);
		map.put("departments", departments);
		return "/update";
	}
	
	@RequestMapping(value="emp",method=RequestMethod.PUT)
	public String update(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
	@RequestMapping(value="emp/{id}",method=RequestMethod.DELETE)
	public String delete(@PathVariable("id")Integer id) {
		employeeDao.remove(id);
		return "redirect:/emps";
	}
	
	@RequestMapping("json")
	@ResponseBody
	public Collection<Employee> json() {
		Collection<Employee> employees = employeeDao.getEmployees();
		return employees;
	}
	
	@RequestMapping("pic")
	public ResponseEntity<byte[]> download(HttpSession session) throws IOException{
		String realPath = session.getServletContext().getRealPath("img");
		String finalPath = realPath + "/" + "1.jpg";
		FileInputStream is = new FileInputStream(finalPath);
		byte[] b = new byte[is.available()];
		is.read(b);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment;filename=1.jpg");
		ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(b, headers, HttpStatus.OK);
		is.close();
		return entity;
	}
	
	@RequestMapping("upload")
	public String upload(MultipartFile upic,HttpSession session) throws IOException {
		String filename = upic.getOriginalFilename();
		String path = session.getServletContext().getRealPath("photo")  + "/" + filename;
		upic.transferTo(new File(path));
		return "success";
	}
	
	@RequestMapping("la")
	public String la() {
		return "abc";
	}
}
