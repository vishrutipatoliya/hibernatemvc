package com.springcore.lifecycleofbean;

public class Pizza {
	private int price;

	public Pizza(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("setting price");
		this.price = price;
	}

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}
	public void init() {
		System.out.println("inside init method");
	}
	public void destroy() {
		System.out.println("inside destroy method");
	}
	
}
