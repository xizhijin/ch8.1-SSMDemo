package com.eric.mybatis.ch8.daoMapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import com.eric.mybatis.ch8.pojo.Role;

@Repository
public interface RoleDaoMapper {
	public int insertRole(Role role);
	
	public int updateRole(Role role);
	
	public int deleteRole(Integer id);
	
	public Role getRole(Integer id);
	
	public List<Role> findRoles(String roleName, RowBounds rowBounds);
	
	
}
