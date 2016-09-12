package com.blog.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import com.blog.dao.UserMapper;
import com.blog.pojo.User;
import com.blog.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	@Override
	public User selectByPrimaryKey(int id) {
		return userMapper.selectByPrimaryKey(id);
//		return null;
	}

}
