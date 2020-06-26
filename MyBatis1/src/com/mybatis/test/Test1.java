package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.bean.Employee;
import com.mybatis.mapper.EmployeeMapper;

public class Test1 {

	@Test
	public void test() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession(true); //开启事务自动提交
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//		Employee employee = mapper.getUserById(103);
//		System.out.println(employee);
//		List<Employee> all = mapper.getAll();
//		all.forEach(System.out::println);
//		Integer result = mapper.insert(new Employee(602,"希达",7000));
//		System.out.println(result);
//		Map<String, String> result = mapper.getUserByIdReturnMap(150);
//		System.out.println(result);
		Map<String, Employee> map = mapper.getAllReturnMap();
		System.out.println(map);
//		Employee employee = new Employee(null,"xiaowang",6000);
//		Integer result = mapper.insert(employee);
//		System.out.println(employee.getEmployeeId());
	}

}
