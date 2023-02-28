package com.springcore.constinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCi {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constinject/ciconfig.xml");
		Person p= (Person) context.getBean("person");
		System.out.println(p);
		Addition add = (Addition) context.getBean("add");
		add.doSum();	
		

	}

	
	
}
