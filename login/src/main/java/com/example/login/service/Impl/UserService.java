package com.example.login.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.domain.User;
import com.example.login.mapper.UserMapper;
import com.example.login.service.IUserService;

@Service
public class UserService implements IUserService {
	
	@Autowired
	UserMapper mapper;

	@Override
	public User selectUser(Long id) {
		
		return mapper.selectUser(id);
	}
	
}
