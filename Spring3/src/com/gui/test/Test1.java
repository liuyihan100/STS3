package com.gui.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gui.service.ServiceI;

public class Test1 {

	@Test
	public void test() {
		ClassPathXmlApplicationContext cs = new ClassPathXmlApplicationContext("jdbc.xml");
//		JdbcTemplate bean = cs.getBean("jdbcTemplate", JdbcTemplate.class);
//		System.out.println(bean);
//		int result = bean.update("insert into employees(employee_id,salary) values(?,?)", 500,12000);
//		System.out.println(result);
//		String sql = "insert into employees(employee_id,last_name,salary) values(?,?,?)";
//		ArrayList<Object[]> list = new ArrayList<Object[]>();
//		list.add(new Object[] {301,"小明",8000});
//		list.add(new Object[] {302,"小红",5000});
//		bean.batchUpdate(sql, list);
//		String sql = "select employee_id,last_name,salary from employees where employee_id = ?";
//		RowMapper<Employee> mapper = new BeanPropertyRowMapper<>(Employee.class);
//		Employee result = bean.queryForObject(sql, new Object[] {301}, mapper);
//		System.out.println(result);
//		String sql = "select count(*) from employees";
//		Integer result = bean.queryForObject(sql, Integer.class);
//		System.out.println(result);
//		String sql = "select employee_id employeeId,last_name lastName,salary from employees where employee_id > ? and employee_id < ?";
//		RowMapper<Employee> mapper = new BeanPropertyRowMapper<>(Employee.class);
//		List<Employee> list = bean.query(sql, new Object[] {100,120}, mapper);
//		list.forEach(System.out::println);
		ServiceI serviceImpl = cs.getBean("serviceImpl", ServiceI.class);
		serviceImpl.play(400, 401);
	}

}
