package com.craftcoder.spring.rest;

import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	private UserDao dao = new UserDao();
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ResponseBody
	public Collection<User> findAll() {
		Collection<User> users = dao.findAll();
		
		return users;
	}
	
}
