package com.springcore.beaninheri;

public class Address {
	private String city,state;

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	} 
	
}
