package com.sr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class BootProj06EnvironmentVariableApplication {

	@Autowired
	private Demo demo;

	
	public BootProj06EnvironmentVariableApplication() {
		System.out.println("0-param constructor");
	}
	
	@Bean("name")
	public Object name() {
		Environment env=demo.getEnv();
		String name=env.getProperty("name");
		System.out.println(env.getProperty("name"));
		return name;
	}

	public static void main(String[] args) {
		System.out.println("creating container");
		ApplicationContext ctx=SpringApplication.run(BootProj06EnvironmentVariableApplication.class, args);
		
	}

}
