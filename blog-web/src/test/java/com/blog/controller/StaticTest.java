package com.blog.controller;

public class StaticTest
{
    public static void main(String[] args)
    {
        staticFunction();
    }
 
    //2
    static StaticTest st = new StaticTest();
 
    //3
    static
    {
        System.out.println("1");
    }
 
    {
    	//1
        System.out.println("2");
    }
 
    StaticTest()
    {
        System.out.println("3");
        System.out.println("a="+a+",b="+b);
    }
 
    //4
    public static void staticFunction(){
        System.out.println("4");
    }
 
    //6
    int a=110;
    //5
    static int b =112;
}
