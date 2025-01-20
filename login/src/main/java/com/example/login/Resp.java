package com.example.login;

import lombok.Data;

@Data
public class Resp {
	
	private User data;
	
	private String msg;
	
	private boolean success;
}
