package com.gui.servlet;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value="hello",method=RequestMethod.POST)
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "liu");
		mv.setViewName("success");
		return mv;
	}
	
//	@RequestMapping("hello")
//	public String hello(Map<String,Object> map) {
//		map.put("name", "liu");
//		return "success";
//	}
	
}