package com.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mybatis.bean.Employee;
import com.mybatis.mapper.EmployeeMapper;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
		InputStream as = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(as);
		SqlSession session = sqlSessionFactory.openSession(true);
		EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
		PageHelper.startPage(3, 5);
		List<Employee> list = mapper.getAllEmployee();
		PageInfo<Employee> info = new PageInfo<Employee>(list,4);
		System.out.println(Arrays.toString(info.getNavigatepageNums()));
		list.forEach(System.out::println);

	}
}
