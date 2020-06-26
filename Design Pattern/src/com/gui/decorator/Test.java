package com.gui.decorator;

public class Test {

	public static void main(String[] args) {
		Drink drink = new Cappuccino();
		System.out.println(drink.getDesc());
		System.out.println(drink.getCost());
		drink = new Sugar(drink);
		System.out.println(drink.getDesc());
		System.out.println(drink.getCost());
		drink = new Chocolate(drink);
		System.out.println(drink.getDesc());
		System.out.println(drink.getCost());
		drink = new Sugar(drink);
		System.out.println(drink.getDesc());
		System.out.println(drink.getCost());
	}
}
