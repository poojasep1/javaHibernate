package com.niit.Hibernatejava;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
		StudentName studentName = new StudentName("fname", "myname", "lastname");
		Student student = new Student(22,2,33,studentName);
		//System.out.println(student);
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(student); 
		//session.save(student); 
		transaction.commit();

		//Student s1 = session.get(Student.class, 14);
		//System.out.println(s1);
      
    
    }
    }

