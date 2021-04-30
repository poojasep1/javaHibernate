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
    {System.out.println( "Hello World!" );
	Student student = new Student(14, "siri", 3,33);
	Student student1 = new Student(15, "chandra", 3,33);
	//System.out.println(student);
	Configuration configuration = new Configuration().configure().addAnnotatedClass(Student.class);

	SessionFactory sessionFactory = configuration.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	Student s1 = session.get(Student.class, 12);
	System.out.println(s1);
	/*
	 * session.save(student); session.save(student1);
	 */
	transaction.commit();
      
    
    }
    }

