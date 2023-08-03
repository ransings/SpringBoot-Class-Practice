package com.sr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sr.sbeans.Student;

public class Test {

	public static void main(String[] args) {
		// create IOC container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sr/cfgs/applicationContext.xml");

		// get bean
		Student std1 = ctx.getBean("std", Student.class);

		// setting roll number for first student
		std1.setRoll_no(101);
		System.out.println("First Student Roll number:: " + std1.getRoll_no());
		System.out.println("student1 hashcode::" + std1.hashCode());

		// get bean
		Student std2 = ctx.getBean("std", Student.class);

		// setting roll number for first student
		std2.setRoll_no(102);
		System.out.println("First Student Roll number:: " + std1.getRoll_no());
		System.out.println("Second Student Roll number:: " + std2.getRoll_no());
		System.out.println("student2 hashcode::" + std2.hashCode());

	}

}
