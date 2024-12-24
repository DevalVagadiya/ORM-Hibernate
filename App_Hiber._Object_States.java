package com.telusko.myhibo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App
{
	public static void main( String[] args)
	{
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
		SessionFactory sf = config.buildSessionFactory;
		Session session = sf.openSession();

		session.beginTransaction();

		Laptop l = new Laptop();
		l.setLid(52);
		l.setBrand("Lenovo");
		l.setPrice(800);

		session.save(l);
		l.setPrice(750);

		session.remove(l);

		session.getTransaction().commit();
		session.detach(1);
		l.setPrice(600);
	}
}