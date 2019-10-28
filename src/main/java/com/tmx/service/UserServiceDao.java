package com.tmx.service;

import java.util.List;

import com.tmx.domian.User;
import org.apache.ibatis.annotations.Param;


public interface UserServiceDao {
	public void firstService(String name);

	public List<User> getUser(User user);
	
	
}
