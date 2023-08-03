package com.sr.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("rslt")
public class StudentResult implements ApplicationContextAware{

	ApplicationContext ctx;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx=applicationContext;		
	}
	
	public float getPercentage() {
		System.out.println("ApplicationContext::"+ctx.hashCode());
	Student std=ctx.getBean("std",Student.class);
	int total=std.getM1()+std.getM2()+std.getM3();
	return total/3.0f;
	}

	
}
