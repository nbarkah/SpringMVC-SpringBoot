package com.prodemy.springmvc.controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;  


@Controller 
public class HelloController {
	
	@RequestMapping("/")  
    public String display(Model model) {
		model.addAttribute("greeting","xixixi");
        return "index";  
    }    
}
