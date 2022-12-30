package com.demo.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.demo.springdemo.mvc.validation.CourseCode;

public class Customer {
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String LastName;
	
	@NotNull(message="is required")
	@Min(value=0,message="Min value is 0")
	@Max(value=10,message="max value is 10")
	private Integer freePasses;
	
	@Pattern(regexp="^[0-9]{6}",message="only 6 digits")
	private String pincode;
	
	@CourseCode(value="LUV",message="must start with LUV")
	private String courseCode;
	
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
}
