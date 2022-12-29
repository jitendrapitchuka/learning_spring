package com.demo.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String convertToUpper(HttpServletRequest request,Model model) {
		String theName=request.getParameter("studentname");
		theName=theName.toUpperCase();
		String res="Yo! " +theName;
		model.addAttribute("message", res);
		
		return "helloworld";
	}
	
	
	@RequestMapping("/processFormVersionThree")
	public String convertToUpperrrrrr(@RequestParam("studentname") String theName,Model model) {
		//String theName=request.getParameter("studentname");
		theName=theName.toUpperCase();
		String res="Yo! " +theName;
		model.addAttribute("message", res);
		
		return "helloworld";
	}
	
}
