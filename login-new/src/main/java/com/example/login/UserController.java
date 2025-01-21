package com.example.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class UserController {
	@Autowired
	UserService service;
	
//	获取所有用户信息
	@RequestMapping("/user")
	@ResponseBody
	public List<User> selectUser() {
		List<User> resp = service.selectUser();
		return resp;
	}
	
//	前往登录界面
	@RequestMapping("/toLogin")
	public String showLoginForm() {
		return "login";
	}
	
//	登录方法
	@PostMapping("/login")
	public String login(User user, Model model) {
//		System.out.println(user);
		String userName = user.getUserName();
		String password = user.getPassword();
		User userData = service.login(userName,password);
		
		if(userData != null) {
//			System.out.println("登录成功");
			return "redirect:/home.html";
		}else {
			System.out.println("登录失败");
			model.addAttribute("loginError", "登录失败，请检查用户名和密码");
			return"login";
		}
	}
}
