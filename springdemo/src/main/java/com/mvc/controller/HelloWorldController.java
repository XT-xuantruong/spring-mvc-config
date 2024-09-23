package com.mvc.controller;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	// need a controller medthod to read form data
	// and add data to the model
	@RequestMapping("/processFormletsShow")
	public String letsShow(HttpServletRequest request, Model model)
	{
		// read the request parameter from the HTML Form
		String theName=request.getParameter("studentName");
		// convert the data to all caps
		theName=theName.toUpperCase();
		// create the message
		String message="Hello " + theName;
		// add message to the model
		model.addAttribute("MESSAGE", message);
		return "helloworld";
	}
	
	
	// need a controller medthod to read form data
		// and add data to the model
		@RequestMapping("/processFormletsAddRequestParam")
		public String letsAddRequestParam(@RequestParam("studentName") String theName,
				Model model)
		{
			// read the request parameter from the HTML Form
			//String theName=request.getParameter("studentName");
			// convert the data to all caps
			theName=theName.toUpperCase();
			// create the message
			String message="Hello from FormletsAddRequestParam " + theName;
			// add message to the model
			model.addAttribute("MESSAGE", message);
			return "helloworld";
		}
	
}
