package com.perpus.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.perpus.model.Person;
import com.perpus.service.PersonService;

@Controller
public class PersonController {
	@Autowired
	private PersonService service;

	@GetMapping("/")
	public ModelAndView home(Model m) {
		Person person = new Person();
		m.addAttribute("person", person);
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	@GetMapping("/register")
	public String registerDisplay(Model m, HttpSession session) {

		Person person = new Person();

		if (session.getAttribute("person") != null) {
			session.invalidate();
		}
		m.addAttribute("person", person);
		return "register";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute("person") Person person, Model model) {
		service.registerPerson(person);
		model.addAttribute("success", "Registered Successfully");
		return "register";
	}

	@GetMapping("/login")
	public String loginDisplay(Model m, HttpSession session) {

		Person person = new Person();

		if (session.getAttribute("person") != null) {
			session.invalidate();
			System.out.println("here");
			m.addAttribute("success", "You have logout Successfully!!!");
		}
		m.addAttribute("person", person);
		return "login";
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("person") Person person, Model model, HttpSession session) {
		Person person2 = service.loginPerson(person);
		System.out.println("person2" + person2);
		if (person2 != null) {
			System.out.println("hello");
			model.addAttribute("person", person2);
			session.setAttribute("person", person2);
			if (person2.getJenis() == 1) return "adminhome";
			else return "userhome";
		}
		if (person2 == null) {
			System.out.println("on");
			model.addAttribute("error", "Invalid Credentials");
		}
		return "login";

	}
}