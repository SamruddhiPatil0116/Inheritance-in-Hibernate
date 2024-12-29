package com.prowings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.prowings.entities.Employee;

public class main {
	public static void main(String[] args) {
		// Step 1: Configure Hibernate
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml"); // Loads the hibernate.cfg.xml file

		// Step 2: Build a SessionFactory
		SessionFactory sessionFactory = config.buildSessionFactory();

		// Step 3: Open a Session
		Session session = sessionFactory.openSession();

		// Step 4: Begin Transaction
		Transaction transaction = session.beginTransaction();

		// Step 5: Create and Save an Employee Object
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("John Doe");
		employee.setSalary(50000.00);
		
		employee.setId(2);
		employee.setName("Samruddhi Patil");
		employee.setSalary(60000.00);
		
		employee.setId(3);
		employee.setName("Sarvesh Patil");
		employee.setSalary(70000.00);
		
		employee.setId(4);
		employee.setName("Varun Patil");
		employee.setSalary(80000.00);


		session.save(employee); // Saves the employee to the database

		// Step 6: Commit the Transaction
		transaction.commit();

		// Step 7: Close the Session
		session.close();
	}
}
