package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/display2")
	public ModelAndView display2() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("name", "Rohith Gupta");
		
		mv.setViewName("display2");
		
		
		return mv;
		
	}
}
 