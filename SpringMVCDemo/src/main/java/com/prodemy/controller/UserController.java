package com.prodemy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prodemy.dao.UserDao;
import com.prodemy.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserDao dao;
	
	@GetMapping
	public String index(Model model) throws Exception {
		List<User> list = dao.findAll();
		model.addAttribute("userlist", list);
		return "user/index";
	}
	
	@GetMapping("/edit")
	public String edit(Model model, HttpServletRequest req) throws Exception {
		User user = dao.findById(Integer.parseInt(req.getParameter("id")));
		
		return "";
	}
}
