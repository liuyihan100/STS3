package com.gui.clone;

import java.io.Serializable;

public class Teacher implements Cloneable,Serializable {
	
	private String name;
	
	private int age;

	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
