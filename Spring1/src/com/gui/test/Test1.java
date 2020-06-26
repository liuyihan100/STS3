package com.gui.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

public class Test1 {
	
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext text = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Object bean1 = text.getBean("person1");
//		System.out.println(bean1);
//		Object bean2 = text.getBean("person2");
//		System.out.println(bean2);
//		Object bean3 = text.getBean("person3");
//		System.out.println(bean3);
//		Object bean4 = text.getBean("person4");
//		System.out.println(bean4);
//		Object bean5 = text.getBean("person5");
//		System.out.println(bean5);
//		Object bean6 = text.getBean("person6");
//		System.out.println(bean6);
//		Object bean7 = text.getBean("person7");
//		System.out.println(bean7);
//		Object map1 = text.getBean("map1");
//		System.out.println(map1);
		DruidDataSource dataSource = text.getBean("datasource", DruidDataSource.class);
		Connection conn = dataSource.getConnection();
		System.out.println(conn);
	}
}
