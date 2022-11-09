/**
 * 
 */
package com.prodemy.springmvc.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author wyant
 *
 */
@Controller
public class PublicController extends BaseController {
	@GetMapping("/")
	public String display(Model model) {
		model.addAttribute("greeting", "Hello awy");
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
