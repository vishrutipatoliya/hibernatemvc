package com.enumPkg;

public class singletonDemo1 {

	public static void main(String[] args) {
		
		Abc abc = Abc.INSTANCE;
		abc.i =5;
		abc.show();
		
		Abc abc1 = Abc.INSTANCE;
		abc1.i =6;
		abc1.show();
		
		
	}

}
enum Abc{
	INSTANCE;
//	public static Abc getInstance() {
//		
//	}
	int i ;
	public void show() {
		System.out.println(i);
	}
	
}
