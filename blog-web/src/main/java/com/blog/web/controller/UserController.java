package com.blog.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.pojo.User;
import com.blog.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/userInfo")
	public String getUserInfo(HttpServletRequest request) {
		User user = userService.selectByPrimaryKey(1);	
		request.setAttribute("userName", user.getUsername());
		return "hello";
	}
}
