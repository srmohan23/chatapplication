package com.helloworld.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.helloworld.helloworld.model.LoginForm;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
    String index() {
        return "index";
    }
	@PostMapping("/login")
	String login(LoginForm loginForm)
	{		
		return "redirect:home";
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	String home() {
		return "home";
	}
	
	
}