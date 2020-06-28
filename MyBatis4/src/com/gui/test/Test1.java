package com.gui.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gui.bean.Employee;
import com.gui.mapper.EmployeeMapper;

public class Test1 {

	@Test
	public void test() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = sqlSessionFactory.openSession(true);
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		PageHelper.startPage(7, 5);//Ò³Âë´Ó1¿ªÊ¼
		List<Employee> employees = mapper.getAll();
		PageInfo<Employee> pageInfo = new PageInfo<Employee>(employees,3);
		System.out.println(Arrays.toString(pageInfo.getNavigatepageNums()));
		employees.forEach(System.out::println);
	}

}
