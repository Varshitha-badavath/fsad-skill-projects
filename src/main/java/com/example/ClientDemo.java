package com.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Product p1 = new Product("Laptop","Dell Laptop",55000,5);
        session.save(p1);

        Product p = session.get(Product.class,1);
        System.out.println(p.getName());

        p.setPrice(50000);
        session.update(p);

        session.delete(p);

        tx.commit();
        session.close();

        System.out.println("CRUD Completed");
    }
}