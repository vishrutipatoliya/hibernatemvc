package com.springcore.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBeanF {

	public static void main(String[] args) {
		
		// bean factory 
//Resource res = new  ClassPathResource("com/springcore/beanfactory/beanfactoryconfig.xml");
//	
//BeanFactory factory = new XmlBeanFactory(res);
//		
//		Emp e  =(Emp) factory.getBean("emp");
//		System.out.println(e);
		
		
		
		//ApplicationContext
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanfactory/beanfactoryconfig.xml");
			Emp e =(Emp) context.getBean("emp");
			System.out.println(e);
			
	
	}

}
