package com.example.login.service;

import org.springframework.stereotype.Service;

import com.example.login.domain.User;


public interface IUserService {
	User selectUser(Long id);
}
