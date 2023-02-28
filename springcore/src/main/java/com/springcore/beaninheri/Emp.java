package com.springcore.beaninheri;

public class Emp {
	private int id;  
	private String name;  
	private Address address;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}  
	void show(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address);  
	}  
	
	

}
