package com.gui.test1.MyTest1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyService {
	@ResponseBody
	@RequestMapping("hello")
	public String hello() {
		return "hello,world";
	}
}
