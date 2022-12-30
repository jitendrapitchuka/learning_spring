package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		

		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession()	;
		
		try {
			
			Student tempStudent1=new Student("jitendra1","sai","abc1@gmail.com");
			Student tempStudent2=new Student("jitendra2","sai","abc2@gmail.com");
			Student tempStudent3=new Student("jitendra3","sai","abc3@gmail.com");

			
			
			session.beginTransaction();
			
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}

	}

}
