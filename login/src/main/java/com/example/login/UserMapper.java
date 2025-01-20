package com.example.login;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

    //	根据id查询用户信息
//	User selectUser(@Param("id")Long id);
	
	List<User> selectUser();
	
//	根据用户名和密码查找数据库
	User loginSelect(@Param("userName")String userName,@Param("password")String password);
}
