package com.springcore.mapcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/mapcollection/collectionconfig.xml");
		Question q = (Question) con.getBean("que1");
		q.diplay();

	}

}
