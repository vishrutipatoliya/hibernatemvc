package com.onetoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapSubjectStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration cfg = new Configuration();
		SessionFactory sfact = cfg.configure().buildSessionFactory();
		
		Students s1 = new Students();
		Students s2 = new Students();
		
		s1.setId(123);
		s1.setName("aditi");
		s1.setBranch("IT");
		
		Subject sub1 = new Subject();
		sub1.setSubCode(330777);
		sub1.setSubjectName("AI");
		sub1.setStudent(s1);
		
		Subject sub2 = new Subject();
		sub2.setSubCode(330309);
		sub2.setSubjectName("AML");
		sub2.setStudent(s1);
		Subject sub3 = new Subject();
		sub3.setSubCode(22070);
		sub3.setSubjectName("CS");
		sub3.setStudent(s2);
		

		Subject sub4 = new Subject();
		sub4.setSubCode(22074);
		sub4.setSubjectName("DBMS");
		sub4.setStudent(s2);
		
		s2.setId(124);
		s2.setName("asha");
		s2.setBranch("CE");
		
	
		
		

//		
		List<Subject> subList = new ArrayList<>();
		subList.add(sub1);
		subList.add(sub2);
		s1.setSubject(subList);
		List<Subject> subList2 = new ArrayList<>();
		subList2.add(sub3);
		subList2.add(sub4);
		s2.setSubject(subList2);
//		List<Students> studentList = new ArrayList<Students>();
//		studentList.add(s1);
//		studentList.add(s2);
		Session s = sfact.openSession();
		Transaction tr = s.beginTransaction();
		
		s.save(s1);
		s.save(s2);
		s.save(sub1);
		s.save(sub2);
		s.save(sub3);
		s.save(sub4);
		s.remove(sub4);
		tr.commit();
		
		Students news = s.get(Students.class,124);
		System.out.println(news.getName()+"  "+news.getBranch());
		for(Subject ss:news.getSubject()) {
			System.out.println(ss.getSubjectName());
		}
		
		s.close();
		sfact.close();
		
	}

}
