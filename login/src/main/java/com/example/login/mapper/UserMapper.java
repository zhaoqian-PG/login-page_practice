package com.example.login.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.login.domain.User;

@Mapper
@Repository
public interface UserMapper {

    //	根据id查询用户信息
	User selectUser(@Param("id")Long id);
}
