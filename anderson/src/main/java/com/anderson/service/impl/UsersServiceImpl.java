package com.anderson.service.impl;
  
import org.springframework.beans.factory.annotation.Autowired;

import com.anderson.dao.UsersMapper;
import com.anderson.entity.Users;
import com.anderson.service.UsersService;

public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper UsersMapper;
	
	public Users selectByPrimaryKey(Integer uid) {
		return UsersMapper.selectByPrimaryKey(uid);
	}
	
	

}
