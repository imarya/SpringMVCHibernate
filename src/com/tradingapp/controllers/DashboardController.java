package com.tradingapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DashboardController {
	
	@RequestMapping("/")
	public ModelAndView dashBoard(){
		
		String message = "Welcome To Trading Application";
		return new ModelAndView("home", "message", message);
	}

}
