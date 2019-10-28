package com.tmx.service.Impl;

import java.util.List;

import com.tmx.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tmx.mapper.UserMapper;
import com.tmx.service.UserServiceDao;

@Service
@Transactional
public class UserServiceImpl implements UserServiceDao{

	//ע��mapper
	@Autowired
	private UserMapper userMapper;
	
	
	public void firstService(String name) {
		System.out.println(name + "�����˷������");
		//����Dao��
		User user = new User();
		user.setUser_name(name);
		userMapper.addUser(user);
	}




	public List<User> getUser(User user) {
		//����dao��
		List<User> userList = userMapper.getUser(user.getUser_name(), user.getUser_password());
		return userList;
	}

}
