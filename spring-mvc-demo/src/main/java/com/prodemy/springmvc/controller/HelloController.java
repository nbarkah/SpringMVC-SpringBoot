package com.prodemy.springmvc.controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
public class HelloController {
	@RequestMapping("/")
	public String display (Model model) {
		model.addAttribute("greeting", "xixixi");
		return "index";
	}
}
