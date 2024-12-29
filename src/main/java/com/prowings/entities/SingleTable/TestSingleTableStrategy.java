package com.prowings.entities.SingleTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.util.HibernateUtils;

public class TestSingleTableStrategy {
	
	public static void main(String[] args) {
		
		Manager manager = new Manager(37, "Ram", 89999, "IT", "pending");
		Cleark cleark = new Cleark(33, "Sham", 23333, "IT", "completed");
		Manager manager1 = new Manager(34,"Samruddhi",56000,"IT", "completed");
		Cleark cleark1 = new Cleark(35, "Sarvesh", 23000, "IT", "pending");

		
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction(); 
		
		session.save(manager);
		session.save(cleark);
		session.save(manager1);
		session.save(cleark1);
		txn.commit();
		session.close();

		
	}

}
