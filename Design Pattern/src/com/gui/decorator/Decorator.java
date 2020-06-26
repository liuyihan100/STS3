package com.gui.decorator;

public class Decorator extends Drink {
	private Drink drink;
	
	public Decorator(Drink drink) {
		this.drink = drink;
	}

	@Override
	public int getCost() {
		
		return super.getPrice() + drink.getCost();
	}
	
	public String getDesc() {
		return drink.getDesc() + "&&" + super.getDesc() + super.getPrice();
	}
	
}
