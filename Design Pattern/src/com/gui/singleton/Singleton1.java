package com.gui.singleton;

public class Singleton1 {
	
	public static void main(String[] args) {
		Singleton1 instance = Single.INSTANCE.getInstance();
		Singleton1 instancex = Single.INSTANCE.getInstance();
		System.out.println(instance==instancex);
	}
}

enum Single{
	
	INSTANCE;
	private Singleton1 singleton = null;
	private Single() {
		singleton = new Singleton1();
	}
	public Singleton1 getInstance() {
		return singleton;
	}
	
}