package com.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sr.sbeans.Student;

@SpringBootApplication
public class BootProj02PropertyFilesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj02PropertyFilesApplication.class, args);
		
		//getting student
		Student std=ctx.getBean("student",Student.class);
		
		System.out.println(std);
		
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
