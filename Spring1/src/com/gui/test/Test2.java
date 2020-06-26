package com.gui.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gui.controller.MyController;

public class Test2 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("net.xml");
		MyController bean = cs.getBean("myController",MyController.class);
		System.out.println(bean);
	}
}
