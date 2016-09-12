package com.blog.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThreadTestController {

	@RequestMapping("/threadtest")
	public String ThreadTest(HttpServletRequest request){
		System.out.println(Thread.currentThread());
		try {
			Thread.currentThread();
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Hello,小法师";
	}
}
