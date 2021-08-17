package com.fis.user.bean;

public class User {
	private int id;
	private String name;
	private double password;
	
public User() {
		
	}
	
	public User(int id,String name,double password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPassword() {
		return password;
	}
	public void setPassword(double password) {
		this.password = password;
	}

}
