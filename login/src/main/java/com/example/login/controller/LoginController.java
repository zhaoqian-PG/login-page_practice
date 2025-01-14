package com.example.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.domain.User;
import com.example.login.service.IUserService;

@RestController
public class LoginController {
	
	@Autowired
	IUserService service;
	
	@GetMapping("/hello")
	public String test() {
		return "hello!";
	}
	
	@GetMapping("/user/{id}")
	public User selectUser(@PathVariable Long id) {
		return service.selectUser(id);
	}
}