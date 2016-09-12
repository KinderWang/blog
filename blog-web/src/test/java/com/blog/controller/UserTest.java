package com.blog.controller;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.blog.dao.UserMapper;
import com.blog.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class UserTest  {

	@Resource
	public UserMapper userMapper;
	
	@Test
	public void SelectTest(){
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}
	@Test
	public void SelectTest1(){
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}
	@Test
	public void SelectTest2(){
		User user = userMapper.selectByPrimaryKey(1);
		System.out.println(user);
	}
}
