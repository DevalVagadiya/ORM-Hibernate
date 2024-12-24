package com.telusko. DemoHib;

import org.hibernate. Session;
import org.hibernate. SessionFactory;
import org.hibernate. Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service. ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App
{
	public static void main(String args) {

	AlienName an = new AlienName();
	an.setFname("NavinKumar Reddy");
	an.setLname("Thatipalli");
	an.setMname("BapReddy");

	//Alien telusko = null;
	Alien telusko = new Alien();
	telusko.setAid(101);
	telusko.setColor("Green");
	telusko.setAname(an);

	Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

	ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry)

	SessionFactory sf = con.buildSessionFactory(reg);

	Session session = sf.openSession;

	Transaction tx = session.beginTransaction();

	//telusko = (Alien) session.get(Alien.class,101);

	session.save(telusko);

	tx.commit();

	System.out.println(telusko);
	}
}