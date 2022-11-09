package com.prodemy.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PublicController extends BaseController{

//	@RequestMapping(value = "/")
//	public ModelAndView mainPage() {
//		return new ModelAndView("home");
//	}
//
//	@RequestMapping(value = "/index")
//	public ModelAndView indexPage() {
//		return new ModelAndView("home");
//	}
	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("greeting", "xixixi");
		return "index";
	}

	@GetMapping("/home")
	public String home(Model model, Authentication auth) {
		if (this.hasRole("ROLE_ADMIN", auth)) return "adminhome";
		if (this.hasRole("ROLE_ADMIN", auth)) return "redirect:/accessdenied";
		
		return "home";
	}

	@GetMapping("/accessdenied")
	public String accessdenied(Model model, Authentication auth) {
		return "accessdenied";
	}
}
