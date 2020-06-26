package com.gui.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxyFactory {
	
	private Object object;
	
	public MyProxyFactory(Object object) {
		this.object = object;
	}
	
	public Object getInstance() {
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				return method.invoke(object, args);
			}
		});
	}
}
