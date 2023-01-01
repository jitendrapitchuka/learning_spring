package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.demo.hibernate.demo.entity.Course;
import com.demo.hibernate.demo.entity.Instructor;
import com.demo.hibernate.demo.entity.InstructorDetail;


public class FetchJoinDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
																				.addAnnotatedClass(InstructorDetail.class)
																				.addAnnotatedClass(Course.class)
																				.buildSessionFactory();
		
		Session session=factory.getCurrentSession()	;
		
		try {
			
			
			int theId=1;
			
			session.beginTransaction();
			
			Query<Instructor>query=session.createQuery("select i from Instructor i "+"JOIN FETCH i.courses "+"where i.id=:theInstructorId",Instructor.class);
			
			query.setParameter("theInstructorId",theId);
			
			Instructor tempInstructor=query.getSingleResult();
			
			System.out.println(tempInstructor);
			
			session.getTransaction().commit();
			
			System.out.println(tempInstructor.getCourses());
			
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
