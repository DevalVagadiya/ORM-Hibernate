package com.telusko, HibaDemo;

import java.util.Random;
//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import arg.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App
{
	public static void main(String[] args)
	{
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory(registry);
		Session session = sf.openSession();
		int b = 60;
		session.beginTransaction();
		/*Random r = new Random();

		for(int i=1; i<=50; i++)
		{
			Student s = new Student();
			s.setRollno(i);
			s.setName("Name "+ i);
			s.setMarks(r.nextInt(100));
			session.save(s);
		}*/

		//Query q = session.createQuery("from Student where marks > 50");
		//List<Student> student = q.list();
		/*for(Student s : student)
		{
			System.out.println(s);
		}*/

		//Query q = session.createQuery("from Student where rollno=7");
		//Student students = (Student)q.uniqueResult();
		//System.out.println(students);

		//Query q = session.createQuery("select rollno,name,marks from Student where rollno=7");
		//Object[] students = (Object[])q.uniqueResult();
		/*for(Student o : students)
		{
			System.out.println(o);
		}*/

		//Query q = session.createQuery("select rollno,name,marks from Student");
		//Query q = session.createQuery("select rollno,name,marks from Student s where s.marks > 60");
		//List<Object[]> students = (List<Object[]>)q.list();
		//for(Object[] student : students)
			//System.out.println(student[0] + " : " + student[1] + " : " + student[2]);

		//Query q = session.createQuery("select sum(marks) from Student s where s.marks > 60");
		/*Query q = session.createQuery("select sum(marks) from Student s where s.marks :b");
		q.setParameter("b",b);
		Long marks = (Long)q.uniqueResult();
		System.out.println(marks);*/

		/*SQLQuery query = session.createSQLQuery("select  * from student where marks>60");
		query.addEntity(Student.class);
		List<Student> student  = query.list();

		for(Student o : students)
		{
			System.out.println(o);
		}*/

		SQLQuery query = session.createSQLQuery("select name, marks from student where marks>60");
		query.setResultTransformer(Criteria. ALIAS_TO_ENTITY_MAP);
		List students = query.list();

		for(Object o: students)
		{
			Map m = (Map)o;
			System.out.println(m.get("name") + " : " + m.get("marks"));
		}

		session.getTransaction().commit();
	}
}