package com.eric.mybatis.ch8.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.eric.mybatis.ch8.daoMapper.RoleDaoMapper;
import com.eric.mybatis.ch8.pojo.Role;
import com.eric.mybatis.ch8.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDaoMapper roleDaoMapper;

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int insertRole(Role role) {
		return roleDaoMapper.insertRole(role);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int updateRole(Role role) {
		return roleDaoMapper.updateRole(role);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public int deleteRole(Integer id) {
		return roleDaoMapper.deleteRole(id);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public Role getRole(Integer id) {
		return roleDaoMapper.getRole(id);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS)
	public List<Role> findRoles(String roleName, int start, int limit) {
		return roleDaoMapper.findRoles(roleName, new RowBounds(start, limit));
	}

}
