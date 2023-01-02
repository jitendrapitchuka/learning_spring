package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.demo.entity.Instructor;
import com.demo.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
																				.addAnnotatedClass(InstructorDetail.class)
																				.buildSessionFactory();
		
		Session session=factory.getCurrentSession()	;
		
		try {
			
			Instructor  tempInstructor    =new Instructor("jitendra","Mr ","temp@gmail.com");
			InstructorDetail tempInstructorDetail=new InstructorDetail("http://www.samplechannel/youtube.com","writing code");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			session.beginTransaction();
			
			session.save(tempInstructor );
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
	}

}
