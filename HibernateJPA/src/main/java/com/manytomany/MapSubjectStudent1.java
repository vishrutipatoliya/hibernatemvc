package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapSubjectStudent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration cfg = new Configuration();
		SessionFactory sfact = cfg.configure().buildSessionFactory();
		
		Students1 s1 = new Students1();
		Students1 s2 = new Students1();
		
//		Students1 s3 = new Students1();
//		Students1 s4 = new Students1();
		
		s1.setId(123);
		s1.setName("aditi");
		s1.setBranch("IT");
		
		Subject1 sub1 = new Subject1();
		sub1.setSubCode(330777);
		sub1.setSubjectName("AI");
//		sub1.setStudent(s1);
		
		Subject1 sub2 = new Subject1();
		sub2.setSubCode(330309);
		sub2.setSubjectName("AML");
//		sub2.setStudent(s1);
//		Subject1 sub3 = new Subject1();
//		sub3.setSubCode(22070);
//		sub3.setSubjectName("CS");
//		sub3.setStudent(s2);
		

//		Subject1 sub4 = new Subject1();
//		sub4.setSubCode(22074);
//		sub4.setSubjectName("DBMS");
//		sub4.setStudent(s2);
		
		s2.setId(124);
		s2.setName("asha");
		s2.setBranch("CE");
		
	
		
		

//		
		List<Subject1> subList = new ArrayList<>();
		subList.add(sub1);
		subList.add(sub2);
		s1.setSubject(subList);
//		List<Subject1> subList2 = new ArrayList<>();
//		subList2.add(sub3);
//		subList2.add(sub4);
//		s2.setSubject(subList2);
		
		List<Students1> studentList = new ArrayList<Students1>();
		studentList.add(s1);
		studentList.add(s2);
		
		sub1.setStudent(studentList);
		s2.setSubject(subList);
		Session s = sfact.openSession();
		
		Transaction tr = s.beginTransaction();
		
		s.save(s1);
		s.save(s2);
		s.save(sub1);
		s.save(sub2);
//		s.save(sub3);
//		s.save(sub4);
		tr.commit();
		s.close();
		sfact.close();
		
	}

}
