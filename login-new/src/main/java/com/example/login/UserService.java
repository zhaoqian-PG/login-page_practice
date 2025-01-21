package com.example.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
	
	@Autowired
	UserMapper mapper;
	
	public List<User> selectUser() {
		return mapper.selectUser();
	}
	
//	用户登录
	public User login(String userName,String password) {
		return mapper.login(userName,password);
	}
	
}
