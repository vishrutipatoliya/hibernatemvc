package com.springcore.collection;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Map.Entry;  
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
		Emp emp1 =(Emp)context.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		
		System.out.println(emp1.getPhones().getClass().getName());  
		Iterator ir = emp1.getPhones().iterator();
		while(ir.hasNext()){  
			System.out.println(ir.next());  
			}  
		for(String p:emp1.getPhones()) {
			System.out.println(p);  
			
		}
		System.out.println(emp1.getAddress());
		for(String p:emp1.getAddress()) {
			System.out.println(p);  
			
		}
		System.out.println(emp1.getCourse());
		 
		 Set set=emp1.getCourse().entrySet();
		  Iterator itr=set.iterator(); 
		 while(itr.hasNext()) {
			 System.out.println("coure "+itr.next()); 
		 }
		for(String p:emp1.getCourse().values()) {
			System.out.println(p);  
			
		}
		System.out.print(emp1.getProps());
		
		
		
		

	}

}
