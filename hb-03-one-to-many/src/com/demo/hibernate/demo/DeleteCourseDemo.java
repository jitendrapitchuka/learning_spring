package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.demo.entity.Course;
import com.demo.hibernate.demo.entity.Instructor;
import com.demo.hibernate.demo.entity.InstructorDetail;


public class DeleteCourseDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
																				.addAnnotatedClass(InstructorDetail.class)
																				.addAnnotatedClass(Course.class)
																				.buildSessionFactory();
		
		Session session=factory.getCurrentSession()	;
		
		try {
			
			int theId=10;
			
			session.beginTransaction();
			
			Course tempCourse=session.get(Course.class, theId);
			
			session.delete(tempCourse);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
