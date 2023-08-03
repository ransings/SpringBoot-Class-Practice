package com.sr;

import java.io.Closeable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sr.sbeans.Teacher;

@SpringBootApplication
public class IocProj12SingletonScopeBeansApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(IocProj12SingletonScopeBeansApplication.class, args);
		
		ctx.getBean("teacher",Teacher.class);
		
		((ConfigurableApplicationContext) ctx).close();
		
		SpringApplication.run(IocProj12SingletonScopeBeansApplication.class, args);
		
	}

}
