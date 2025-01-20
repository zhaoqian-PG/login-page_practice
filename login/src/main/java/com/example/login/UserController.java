package com.example.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
	@Autowired
	UserService service;
	
	@RequestMapping("/hello")
	public String test() {
		return "hello!";
	}
	
	@RequestMapping("/user")
	public List<User> selectUser() {
		List<User> resp = service.selectUser();
		return resp;
	}
	
//	登录方法
	@PostMapping("/login")
	public Resp login(@RequestBody User user) {
		return service.login(user);
	}
}
