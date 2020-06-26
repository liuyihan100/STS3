package com.gui.decorator;

public class Coffee extends Drink {
	
	public int getCost() {
		return super.getPrice();
	}
	
	public String getDesc() {
		return super.getDesc() + super.getPrice();
	}
}
