package com.example.login;

import java.util.Date;

import lombok.Data;

@Data
public class User {
	private Long id;//id

    private String userName;//用户名

    private String password;//密码

    private String nickName;//nick_name
    
    private String email;//邮箱
    
    private boolean isDelete;
    
    private String avatar;

    private Date userCreated;//创建时间

    private Date userModified;//更新时间
}
