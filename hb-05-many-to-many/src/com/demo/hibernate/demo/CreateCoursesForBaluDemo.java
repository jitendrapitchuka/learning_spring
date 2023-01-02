package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.hibernate.demo.entity.Course;
import com.demo.hibernate.demo.entity.Instructor;
import com.demo.hibernate.demo.entity.InstructorDetail;
import com.demo.hibernate.demo.entity.Review;
import com.demo.hibernate.demo.entity.Student;


public class CreateCoursesForBaluDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
																				.addAnnotatedClass(InstructorDetail.class)
																				.addAnnotatedClass(Course.class)
																				.addAnnotatedClass(Review.class)
																				.addAnnotatedClass(Student.class)
																				.buildSessionFactory();
		
		Session session=factory.getCurrentSession()	;
		
		try {
			session.beginTransaction();
			
			int theId=3;
			
			Student tempStudent=session.get(Student.class, theId);
			
			System.out.println(tempStudent.getCourses());
			
			Course tempCourse1=new Course("rest api spring");
			Course tempCourse2=new Course("rest api django");
			
			tempCourse1.addStudent(tempStudent);
			tempCourse2.addStudent(tempStudent);
			
			session.save(tempCourse1);
			session.save(tempCourse2);
		
			
			session.getTransaction().commit();
			
			
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
