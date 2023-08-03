package com.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sr.sbeans.Person;
import com.sr.sbeans.ProfileDemo;

@SpringBootApplication
@ComponentScan(basePackages = "com.sr.sbeans")
public class BootProj07ProfilesApplication {

	public static void main(String[] args) {
		//create IOc Container
	ApplicationContext ctx=	SpringApplication.run(BootProj07ProfilesApplication.class, args);

	//getting object of person 
	ProfileDemo pd=ctx.getBean("person",ProfileDemo.class);
	
	//display content
	System.out.println(pd);
	
	//close IoC container
	((ConfigurableApplicationContext) ctx).close();
	
	
	}

}
