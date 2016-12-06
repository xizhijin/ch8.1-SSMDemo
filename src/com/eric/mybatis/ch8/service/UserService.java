package com.eric.mybatis.ch8.service;

import java.util.List;

import com.eric.mybatis.ch8.pojo.User;

public interface UserService {

	public User getUser(Integer id);
	
	public int insertUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(Integer id);
	
	public List<User> findUsers(String userName, int start, int limit);
}
