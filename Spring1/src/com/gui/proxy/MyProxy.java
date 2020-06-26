package com.gui.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.gui.execute.Execute;

public class MyProxy {
	
	private Execute execute;
	
	public MyProxy(Execute execute) {
		this.execute = execute;
	}
	
	public Object getProxy() {
		
		ClassLoader loader = this.getClass().getClassLoader();
		Class[] interfaces = execute.getClass().getInterfaces();
		
		return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("hello");
				Object result = method.invoke(execute, args);
				System.out.println("world");
				return result;
			}
		});
	}
}
