package com.gui.bean;

public class Department {
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	
}