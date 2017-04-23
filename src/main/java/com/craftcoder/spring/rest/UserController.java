package com.craftcoder.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public String findAll() {
		return "Alexandre Gama";
	}
	
}
