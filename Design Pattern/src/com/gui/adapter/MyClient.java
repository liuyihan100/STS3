package com.gui.adapter;

public class MyClient extends MyAdapter {
	
	@Override
	public void a() {
		System.out.println("a");
	}
	
	public static void main(String[] args) {
		MyClient client = new MyClient();
		client.a();
		client.b();
	}
}
