package com.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sr.sbeans.Student;

@SpringBootApplication
public class BootProj04BulkInjectionUsingYmlApplication {


	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj04BulkInjectionUsingYmlApplication.class, args);
		
		Student std=ctx.getBean("student",Student.class);
		System.out.println(std);
		
		((ConfigurableApplicationContext) ctx).close();
		
	}


}
