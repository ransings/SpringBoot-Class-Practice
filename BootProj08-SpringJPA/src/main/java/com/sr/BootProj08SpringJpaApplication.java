package com.sr;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sr.entity.Student;
import com.sr.service.StudentService;
import com.sr.service.StudentServiceImpl;

@SpringBootApplication
public class BootProj08SpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj08SpringJpaApplication.class, args);
		Scanner sc= new Scanner(System.in);
		//getting object of Service class
		StudentService std=ctx.getBean("service",StudentServiceImpl.class);
		
		System.out.println("Enter Name::");
		String name=sc.next();
		
		System.out.println("Enter Address::");
		String addr=sc.next();
		
		Student student=new Student();
		student.setName(name);
		student.setAddress(addr);
		
		std.registerStudent(student);
		
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
