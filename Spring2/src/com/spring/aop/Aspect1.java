package com.spring.aop;

import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class Aspect1 {
	
	@Before(value = "execution(* com.spring.aop.*.*(..))")
	public void before(JoinPoint point) {
		Object[] args = point.getArgs();
		String name = point.getSignature().getName();
		System.out.println(name + Arrays.toString(args));
	}
	
	@After(value="execution(* com.spring.aop.*.*(..))")
	public void after() {
		System.out.println("后置通知");
	}
	
	@AfterReturning(value="execution(* com.spring.aop.*.*(..))",returning="result")
	public void afterReturning(Object result) {
		System.out.println(result);
	}
	
	@AfterThrowing(value="execution(* com.spring.aop.*.*(..))",throwing="ex")
	public void afterThrowing(Exception ex) {
		System.out.println("异常通知");
		System.out.println(ex);
	}
	
	@Around(value="execution(* com.spring.aop.*.*(..))")
	public Object around(ProceedingJoinPoint point) {
		
		try {
			System.out.println("1");
			Object result = point.proceed();
			System.out.println("2");
			return result;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		return -1;
	}
}
