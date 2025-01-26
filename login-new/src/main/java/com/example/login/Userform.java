package com.example.login;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Userform {
	
	@NotBlank
	@Size(max = 12) //用户名必须输入，且长度不能超过12位
	private String userName;//用户名
	
	@NotBlank
	@Size(max = 12) //密码必须输入，且长度不能超过12位
    private String password;//密码
}
