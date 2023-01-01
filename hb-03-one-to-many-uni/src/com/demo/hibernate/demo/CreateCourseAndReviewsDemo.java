package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.demo.entity.Course;
import com.demo.hibernate.demo.entity.Instructor;
import com.demo.hibernate.demo.entity.InstructorDetail;
import com.demo.hibernate.demo.entity.Review;


public class CreateCourseAndReviewsDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
																				.addAnnotatedClass(InstructorDetail.class)
																				.addAnnotatedClass(Course.class)
																				.addAnnotatedClass(Review.class)
																				.buildSessionFactory();
		
		Session session=factory.getCurrentSession()	;
		
		try {
			
			Course tempCourse=new Course("spring boot hibernate");
			tempCourse.addReview(new Review("This is super course"));
			tempCourse.addReview(new Review("This is damn good course"));
			tempCourse.addReview(new Review("This is fantanstic course"));
			
			session.beginTransaction();
			
			session.save(tempCourse);
		
			
			session.getTransaction().commit();
			
			
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
