package com.eric.mybatis.ch8.service;

import java.util.List;

import com.eric.mybatis.ch8.pojo.Role;

public interface RoleService {
	public int insertRole(Role role);
	
	public int updateRole(Role role);
	
	public int deleteRole(Integer id);
	
	public Role getRole(Integer id);
	
	public List<Role> findRoles(String roleName, int start, int limit);
	
}
