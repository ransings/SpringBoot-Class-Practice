package com.sr.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sr.sbean.Student;

public class MainClass {

	public static void main(String[] args) {
		//create container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/sr/cfgs/applicationContext.xml");
		
		//create object of Student class
		Student std=ctx.getBean("std",Student.class);
		
		//access value
		System.out.println(std.getId()+" "+std.getName()+" "+std.getFeesPaid());

	}

}
