package com.singletonpkg;

public class SinglrtonC {

	public static void main(String[] args) {
//				Abc obj2 = Abc.getInstance();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				Abc obj = Abc.getInstance();

			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				Abc obj = Abc.getInstance();

			}
			
		});
		t1.start();
//		try{ Thread.sleep(10);}catch(Exception  e) {}
		t2.start();
		

	

}
}
class Abc{
	public static Abc obj ;// Eager
	
	private Abc() {
		System.out.println("Instance created");
		
	}
	public static  Abc getInstance() {
		
			if(obj == null) {
				synchronized(Abc.class) {
					if(obj == null) {
						obj = new Abc();
					}
				}
				
			}
		
		
		return obj;
		
	}
	
}
