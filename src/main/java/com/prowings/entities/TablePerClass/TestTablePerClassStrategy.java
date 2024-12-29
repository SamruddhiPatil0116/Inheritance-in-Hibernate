package com.prowings.entities.TablePerClass;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.prowings.util.HibernateUtils;

public class TestTablePerClassStrategy {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota", "Camry", 30000, 500.0);
        SUV suv = new SUV("Ford", "Explorer", 40000, true);
        Sedan sedan2 = new Sedan("Honda", "Accord", 32000, 550.0);
        SUV suv2 = new SUV("Jeep", "Cherokee", 45000, false);

        SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction txn = session.beginTransaction();

        session.save(sedan);
        session.save(suv);
        session.save(sedan2);
        session.save(suv2);

        txn.commit();
        session.close();
    }
}
