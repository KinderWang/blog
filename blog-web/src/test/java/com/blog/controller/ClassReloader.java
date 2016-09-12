package com.blog.controller;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClassReloader extends ClassLoader {

	private String classPath;
	String className = "com.blog.web.controller.UserController";
	public ClassReloader(String classPath) {
		this.classPath = classPath;
	}
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException{
		byte[] classData = getData(name);
		if(classData == null){
			throw new ClassNotFoundException();
		}else{
			return defineClass(className,classData,0,classData.length);
		}
	}
	private byte[] getData(String className){
		try {
			String path = classPath + className;
			InputStream is = new FileInputStream(path);
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			byte[] buffer = new byte[2048];
			int num = 0;
			while((num = is.read(buffer))!=-1){
				stream.write(buffer,0,num);
			}
			is.close();
			return stream.toByteArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
		
		try {
			String path = "D:/WorkSpace/Java/blog/target/blog/WEB-INF/classes/com/blog/web/controller/";
			ClassReloader reloader = new ClassReloader(path);
			Class r = reloader.findClass("UserController.class");
			System.out.println(r.newInstance());
			ClassReloader reloader2 = new ClassReloader(path);
			Class r2 = reloader2.findClass("UserController.class");
			System.out.println(r2.newInstance());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
