package com.gui.clone;

public class Sheep implements Cloneable {
	private int age;
	private String name;
	private Sheep friend;
	
	public Sheep(int age, String name, Sheep friend) {
		super();
		this.age = age;
		System.out.println("hello");
		this.name = name;
		this.friend = friend;
	}
	
	public Sheep() {
		super();
		System.out.println("friend");
	}
	
	public Sheep getFriend() {
		return this.friend;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep sheep1 = new Sheep(15,"Ser",new Sheep());
		Sheep sheep2 = (Sheep)sheep1.clone();
		Sheep friend1 = sheep1.getFriend();
		Sheep friend2 = sheep2.getFriend();
		String name1 = sheep1.getName();
		String name2 = sheep2.getName();
		System.out.println(sheep1.hashCode());
		System.out.println(sheep2.hashCode());
		System.out.println(friend1);
		System.out.println(friend2);
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		System.out.println(sheep1 == sheep2);
		System.out.println(friend1 == friend2);
		System.out.println(name1 == name2);
	}
}
