package com.eric.mybatis.ch8.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eric.mybatis.ch8.daoMapper.UserDaoMapper;
import com.eric.mybatis.ch8.pojo.User;
import com.eric.mybatis.ch8.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDaoMapper userDaoMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int insertUser(User user) {
		return userDaoMapper.insertUser(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int updateUser(User user) {
		return userDaoMapper.updateUser(user);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int deleteUser(Integer id) {
		return userDaoMapper.deleteUser(id);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public User getUser(Integer id) {
		return userDaoMapper.getUser(id);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<User> findUsers(String userName, int start, int limit) {
		return userDaoMapper.findUsers(userName, new RowBounds(start, limit));
	}

}
