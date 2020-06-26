package com.gui.bean;

import java.util.ArrayList;

public class Person {
	private String name;
	private String age;
	private Teacher teacher;
	private ArrayList students;
	
	public ArrayList getStudents() {
		return students;
	}

	public void setStudents(ArrayList students) {
		this.students = students;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", teacher=" + teacher + ", students=" + students + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person() {
	}
	
}
