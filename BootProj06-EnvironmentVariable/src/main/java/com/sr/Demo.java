package com.sr;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
	@Autowired
	private Environment env;

	public Environment getEnv() {
		return env;
	}

	
	
	
	
}
