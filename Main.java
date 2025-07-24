package com.subodh.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.subodh.SpringBeans.Student;

public class Main {

	public static void main(String[] args) {
		
		String resource_file_path="com/subodh/cfg/applicationContext.xml";
		ApplicationContext ctx=new ClassPathXmlApplicationContext( resource_file_path);
		
		Student std=(Student) ctx.getBean("student");
		std.display();

	}

}
