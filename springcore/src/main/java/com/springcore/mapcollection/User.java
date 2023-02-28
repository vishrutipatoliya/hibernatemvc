package com.springcore.mapcollection;

public class User {
	private int id;  
	private String uname;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String uname) {
		super();
		this.id = id;
		this.uname = uname;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + uname + "]";
	}
	
	
	
}
