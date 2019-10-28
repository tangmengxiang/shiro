package com.tmx.mapper;

import java.util.List;

import com.tmx.domian.User;
import org.apache.ibatis.annotations.Param;



public interface UserMapper {
	public void addUser(User user);

	/* public List<User> getUser(User user); */
	public List<User> getUser(@Param("user_name") String username, @Param("user_password") String password);
}
