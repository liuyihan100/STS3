package com.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.aop.MathI;

public class Test1 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("aop1.xml");
		MathI bean = cs.getBean("mathImpl",MathI.class);
//		int result = bean.add(1, 1);
//		Cg cg = cs.getBean("cg", Cg.class);
//		cg.play();
		bean.div(1, 1);
	}
}
