package com.eric.mybatis.ch8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eric.mybatis.ch8.pojo.Role;
import com.eric.mybatis.ch8.service.RoleService;

@Controller
public class RoleController {
	
	@Autowired
	private RoleService roleService;

	@RequestMapping("/role/getRole")
	@ResponseBody
	public Role getRole(@RequestParam("id") int id) {
		long start = System.currentTimeMillis();
		Role role = roleService.getRole(id);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		return role;
	}
}
