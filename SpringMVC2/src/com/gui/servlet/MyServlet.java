package com.gui.servlet;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gui.bean.Employee;
import com.gui.dao.EmployeeDao;

@Controller
public class MyServlet {
	
//	@RequestMapping(value="hello/{username}/{id}",method=RequestMethod.GET)
//	public String hello(@PathVariable("username")String username,@PathVariable("id")Integer id) {
//		System.out.println(username + " " + id);
//		return "hello";
//	}
	
//	@RequestMapping(value="hello",method=RequestMethod.POST)
//	public String hello(@RequestParam(value="username",required=false,defaultValue="123")String name,String password) {
//		System.out.println(name + " " + password);
//		return "hello";
//	}
//	
//	@RequestMapping(value="hello",method=RequestMethod.POST)
//	public String hello(@RequestHeader(value="Accept-Language")String language) {
//		System.out.println(language);
//		return "hello";
//	}
//	
//	@RequestMapping(value="hello",method=RequestMethod.POST)
//	public String hello(@CookieValue(value="JSESSIONID",required=false,defaultValue="123")String JSESSIONID) {
//		System.out.println(JSESSIONID);
//		return "hello";
//	}
	
//	@RequestMapping(value="hello",method=RequestMethod.POST)
//	public String hello(HttpServletRequest request) {
//		String password = request.getParameter("password");
//		System.out.println(password);
//		return "hello";
//	}
	
//	@RequestMapping(value="hello",method=RequestMethod.POST)
//	public ModelAndView hello() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("name", "liu");
//		mv.setViewName("success");
//		return mv;
//	}
	
	
	@RequestMapping(value="hello")
	public ModelAndView hello(HttpSession session) {
		ModelAndView mv = new ModelAndView();
		ServletContext sc = session.getServletContext();
		ApplicationContext cs = (ApplicationContext)sc.getAttribute("cs");
		Employee employee = cs.getBean("employee", Employee.class);
		System.out.println(employee);
		mv.setViewName("success");
		return mv;
	}
	
//	@RequestMapping("hello")
//	public String hello(Map<String,Object> map) {
//		map.put("name", "liu");
//		return "success";
//	}
	
}