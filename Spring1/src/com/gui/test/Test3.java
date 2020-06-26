package com.gui.test;

import com.gui.execute.Execute;
import com.gui.inter.Exe;
import com.gui.proxy.MyProxy;

public class Test3 {
	
	public static void main(String[] args) {
		MyProxy proxy = new MyProxy(new Execute());
		Exe exe = (Exe)proxy.getProxy();
		System.out.println(exe.add(1,1));
	}
	
}
