package com.gui.strategy;

public class User {
	
	public void play(Type type,Integer money) {
		type.get().pay(money);
	}
	
}
