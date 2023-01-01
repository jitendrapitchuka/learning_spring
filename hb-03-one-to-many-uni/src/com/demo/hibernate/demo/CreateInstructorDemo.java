package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.demo.entity.Course;
import com.demo.hibernate.demo.entity.Instructor;
import com.demo.hibernate.demo.entity.InstructorDetail;


public class CreateInstructorDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
																				.addAnnotatedClass(InstructorDetail.class)
																				.addAnnotatedClass(Course.class)
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
			session.close();
			factory.close();
		}
	}

}
