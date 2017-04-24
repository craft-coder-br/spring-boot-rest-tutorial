package com.craftcoder.spring.rest;

import java.util.Collection;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private UserDao dao = new UserDao();
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public Collection<User> findAll() {
		Collection<User> users = dao.findAll();
		
		return users;
	}
	
	@RequestMapping(value = "/users/{userId}", method = RequestMethod.GET, produces = "application/xml")
	public User findById(@PathVariable(name = "userId") Long id) {
		User user = dao.findById(id);
		
		return user;
	}
	
}
