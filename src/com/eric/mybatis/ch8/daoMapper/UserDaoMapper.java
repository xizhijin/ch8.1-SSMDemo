package com.eric.mybatis.ch8.daoMapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import com.eric.mybatis.ch8.pojo.User;

@Repository
public interface UserDaoMapper {
	
	public User getUser(Integer id);
	
	public int insertUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(Integer id);
	
	public List<User> findUsers(String userName, RowBounds rowBounds);
	
}
