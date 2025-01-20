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
	public Resp login(User user) {
		String userName = user.getUserName();
		String password = user.getPassword();
		User userData = mapper.loginSelect(userName,password);
		
		Resp resp = new Resp();
		
		if(userData == null) {
			resp.setMsg("ユーザ情報が存在しません");
			resp.setSuccess(false);
		}else {
			resp.setData(userData);
			resp.setMsg("ログイン成功");
			resp.setSuccess(true);
		}
		
		return resp;
	}
	
}
