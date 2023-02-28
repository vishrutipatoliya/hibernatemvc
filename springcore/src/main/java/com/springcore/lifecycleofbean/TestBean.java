package com.springcore.lifecycleofbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBean {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycleofbean/beanlifeconfig.xml");
		//registering shutdown hook
		context.registerShutdownHook();
//		Pizza p1 = (Pizza) context.getBean("p1");
//		System.out.println(p1.getPrice());
//		
//	
//		System.out.println("-----------------------------");
//		Pepsi ps1 =(Pepsi) context.getBean("ps1");
//		System.out.println(ps1.getPrice());
		
		Example example =(Example) context.getBean("example");
		System.out.println(example);
	}

}
