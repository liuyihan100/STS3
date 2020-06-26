package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class MathImpl  implements MathI {

	
	public int add(int x,int y) {
		
		return x + y;
	}


	public int sub(int x,int y) {
		
		return x - y;
	}
	

	public int div(int x,int y) {
		return x / y;
	}
	
}
