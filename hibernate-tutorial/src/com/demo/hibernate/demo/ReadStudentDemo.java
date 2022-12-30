package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession()	;
		
		try {
			
			Student tempStudent=new Student("vara","pradad","zxc@gmail.com");
			
			
			session.beginTransaction();
			
			session.save(tempStudent);
			
			session.getTransaction().commit();
			
			session=factory.getCurrentSession()	;
			
			session.beginTransaction();
			
			Student myStudent=session.get(Student.class, tempStudent.getId());
			
			System.out.println("student is "+myStudent);
			
			session.getTransaction().commit();
			
		}
		finally {
			factory.close();
		}
	}

}
