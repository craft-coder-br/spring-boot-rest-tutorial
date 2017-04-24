package com.craftcoder.spring.rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "user")
public class User {

	@XmlElement(name = "id")
	private Long id;

	@JsonProperty(value = "username")
	@XmlElement(name = "username")
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
