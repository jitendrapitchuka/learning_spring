package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession()	;
		
		try {
			
			int studentId=1;
			
			session=factory.getCurrentSession()	;
			
			session.beginTransaction();
			
			Student myStudent=session.get(Student.class, studentId);
			
			System.out.println("student is "+myStudent);
			
			myStudent.setFirstName("bhai jitendra");
			
			System.out.println("updated student is "+myStudent);
			
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
	}

}
