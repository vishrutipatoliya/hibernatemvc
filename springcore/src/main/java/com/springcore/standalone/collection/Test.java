package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standalonecollectionconfig.xml");
	Person p1 = (Person) con.getBean("person1");
	System.out.println(p1);
	System.out.println(p1.getFriends().getClass().getName());
	System.out.println(p1.getFeestructure());
	System.out.println(p1.getFeestructure().getClass().getName());
	System.out.println(p1.getProperties());
	
	}

}
