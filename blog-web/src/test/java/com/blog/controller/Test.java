package com.blog.controller;

public class Test {
	public static void main(String[] args) {
		System.out.println(b);
		staticFunction();
	}
	Test(){
		System.out.println(a);
		System.out.println(b);
	}
	{
		System.out.println(2);
	}
	int a = 20;
	static Test test = new Test();
	static int b = 30;
	static {
		System.out.println(3);
	}
	
	public static void staticFunction(){
        System.out.println("4");
    }
}
