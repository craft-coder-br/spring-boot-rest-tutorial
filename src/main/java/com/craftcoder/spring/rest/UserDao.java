package com.craftcoder.spring.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserDao {

	private Map<Long, User> usersDatabase = new HashMap<>();
	
	public UserDao() {
		usersDatabase.put(1L, new User(1L, "Alexandre Gama"));
		usersDatabase.put(2L, new User(2L, "George Harrison"));
		usersDatabase.put(3L, new User(3L, "Bill Wilson"));
	}
	
	public User findById(Long id) {
		return usersDatabase.get(id);
	}
	
	public Collection<User> findAll() {
		return usersDatabase.values();
	}
	
}
