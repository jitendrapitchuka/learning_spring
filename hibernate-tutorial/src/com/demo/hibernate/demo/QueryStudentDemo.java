package com.demo.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.demo.hibernate.demo.entity.Student;
import java.util.List;


public class QueryStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session=factory.getCurrentSession()	;
		
		try {
			session.beginTransaction();
			
			List<Student> theStudents=session.createQuery("from Student").list();
			
			displayStudents(theStudents);
			
			theStudents=session.createQuery("from Student s where s.firstName='jitendra2'").list();
			
			displayStudents(theStudents);
			
			theStudents=session.createQuery("from Student s where" + " s.firstName='jitendra2' OR s.firstName='vara'").list();
			
			displayStudents(theStudents);

			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for(Student x:theStudents) {
			System.out.println(x);
		}
	}

}
