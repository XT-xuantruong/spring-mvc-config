package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	// xay dung controller method
	@RequestMapping("/")
	public String showPage()
	{
		return "main-menu";
	}
}
