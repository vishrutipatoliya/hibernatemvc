package com.springcore.auto.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	 @Autowired
	 @Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}
//	 @Autowired(required = false)
	public void setAddress(Address address) {
		this.address = address;
	}
	
//	 @Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside construtor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
