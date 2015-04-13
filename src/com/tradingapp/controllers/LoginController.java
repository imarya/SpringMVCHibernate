package com.tradingapp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tradingapp.dto.User;
import com.tradingapp.services.ILoginService;

@Controller
public class LoginController {

	@Autowired
	private ILoginService loginService;

	private User user = new User();

	@RequestMapping("/login")
	public ModelAndView doLogin(HttpServletRequest request) {

		System.out.println(request.getParameter("userName") + " "
				+ request.getParameter("pwd"));
		user.setPwd(request.getParameter("pwd"));
		user.setName(request.getParameter("userName"));
		if (loginService.authenticateUser(user)) {
			String message = "Post New Ad Here";
			return new ModelAndView("newAd", "message", message);
		}
		return new ModelAndView("home", "message", "Invalid Credentials");
	}
}
