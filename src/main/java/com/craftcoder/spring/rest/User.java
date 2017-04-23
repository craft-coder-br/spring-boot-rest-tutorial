package com.craftcoder.spring.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	private Long id;

	@JsonProperty(value = "username")
	private String name;

	User() {}
	
	public User(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
