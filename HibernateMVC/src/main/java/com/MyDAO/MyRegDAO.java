package com.MyDAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import com.MyVO.MyRegVO;

public class MyRegDAO {

	public void insert(MyRegVO regVO) {

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(regVO);
		
		transaction.commit();
		session.close();
	}


	
	public List search() {

		List searchList = new ArrayList<>();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query q = session.createQuery("from RegVO");
		
		searchList = q.list();
		
		transaction.commit();
		session.close();
		
		return searchList;
	}

}
