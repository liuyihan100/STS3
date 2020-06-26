package com.gui.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyFactory implements MethodInterceptor {
	
	private Object object;
	
	public ProxyFactory(Object object) {
		this.object = object;
	}
	
	public Object getInstance() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.object.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		
		return arg1.invoke(object, arg2);
	}

}
