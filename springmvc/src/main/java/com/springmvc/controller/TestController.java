package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	
	
	@RequestMapping("/testurl")
	public String test()
	{
		System.out.println("Hellooooooo");
		return "Test";
	}
	
	@RequestMapping("/display")
	public String display(Model model) {
		
		model.addAttribute("name", "Rohith");
	
		return "displayName";
	}
}
 