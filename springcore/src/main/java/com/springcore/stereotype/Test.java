package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeconfig.xml");
		Student student = (Student) con.getBean("ob");
		System.out.println(student.hashCode());
		
		Student student1 = (Student) con.getBean("ob");
		System.out.println(student1.hashCode());
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass().getName());
		
		ApplicationContext cont = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeconfig.xml");
		Teacher t1 = (Teacher) cont.getBean("teach1");
		System.out.println(t1.hashCode());

		Teacher t2 = (Teacher) cont.getBean("teach1");
		System.out.println(t2.hashCode());
	}

}
