package com.gui.proxy;

public class Test1 {
	
	public static void main(String[] args) {
//		IBase instance = (IBase)new MyProxyFactory(new Base()).getInstance();
//		instance.buy();
		Base instance = (Base)new ProxyFactory(new Base()).getInstance();
		instance.buy();
	}
}
