package com.springcore.beaninheri;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  cont = new ClassPathXmlApplicationContext("com/springcore/beaninheri/beaninheritconfig.xml");
		Emp  em1 = (Emp) cont.getBean("emp2");
		em1.show();

	}

}
