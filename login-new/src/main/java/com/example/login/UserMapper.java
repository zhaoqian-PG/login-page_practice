package com.example.login;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    //	根据id查询用户信息
//	User selectUser(@Param("id")Long id);
	
	List<User> selectUser();
	
//	用户登录
	User login(@Param("userName")String userName,@Param("password")String password);
}
