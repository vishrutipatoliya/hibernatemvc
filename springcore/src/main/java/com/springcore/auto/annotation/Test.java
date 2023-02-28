package com.springcore.auto.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/auto/annotation/autowireannotationconfig.xml");
		Emp e1 = (Emp) con.getBean("emp1");
		System.out.println(e1.getAddress());
		

	}

}
