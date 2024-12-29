package com.prowings.entities.JoinedTable;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.util.HibernateUtils;

public class TestJoinedTableStrategy {
    public static void main(String[] args) {
        UndergraduateStudent uStudent1 = new UndergraduateStudent("Varun", 20, "Computer Science");
        UndergraduateStudent uStudent2 = new UndergraduateStudent("Viraj", 21, "Mathematics");
        GraduateStudent gStudent1 = new GraduateStudent("Sarvesh", 25, "Machine Learning");
        GraduateStudent gStudent2 = new GraduateStudent("Samruddhi", 26, "Quantum Computing");

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction txn = session.beginTransaction();

        session.save(uStudent1);
        session.save(uStudent2);
        session.save(gStudent1);
        session.save(gStudent2);

        txn.commit();
        session.close();

        System.out.println("Data saved successfully!");
    }
}

