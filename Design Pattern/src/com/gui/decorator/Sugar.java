package com.gui.decorator;

public class Sugar extends Decorator {

	public Sugar(Drink drink) {
		super(drink);
		setDesc("糖");
		setPrice(2);
	}

}
