package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.Entities.Users;

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
	public String display2() {
		
		/*
		 * ModelAndView mv = new ModelAndView();
		 * 
		 * mv.addObject("name", "Rohith Marri");
		 * 
		 * mv.setViewName("display2");
		 */
		
		
		return "display2";
		
	}
	
	
	@ModelAttribute
	public void common(Model m)
	{
		String h1 = "Sample Header to display";
		m.addAttribute("h1", h1);
		
	}
	
	
	  @RequestMapping(path = "/welcome", method = RequestMethod.POST) 
	  public String welcome(@ModelAttribute Users user, Model mv) {
		  
		  System.out.println(user.getEmail());
		  return "welcome"; 
	  }
	  
		/*
		 * @RequestMapping(path = "/welcome", method = RequestMethod.POST) public
		 * ModelAndView welcome(
		 * 
		 * @RequestParam(name = "username", required=false) String username,
		 * 
		 * @RequestParam("email") String email,
		 * 
		 * @RequestParam("password") String pass, ModelAndView mv) {
		 * mv.addObject("username",username); mv.addObject("email",email);
		 * mv.addObject("pass",pass);
		 * 
		 * mv.setViewName("welcome");
		 * 
		 * 
		 * 
		 * return mv; }
		 */
	 
}
 