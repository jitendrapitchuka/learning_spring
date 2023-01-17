package com.demo.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	private List<Student> theStudents;
	
	@PostConstruct
	public void loadData() {
		 theStudents=new ArrayList<>();
		
		theStudents.add(new Student("jiten","sai"));
		theStudents.add(new Student("balu","sai"));
		theStudents.add(new Student("chinna","sai"));
		
	}
	
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return theStudents;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		if(studentId>=theStudents.size() || studentId<0) {
			throw new StudentNotFoundException("student id not found");
		}
		return theStudents.get(studentId);
		 
	}
	
	@ExceptionHandler
	public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException e){
		
		StudentErrorResponse error=new StudentErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(e.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
}
