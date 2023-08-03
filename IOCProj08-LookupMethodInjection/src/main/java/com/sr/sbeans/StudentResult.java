package com.sr.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("rslt")
public abstract class StudentResult{

	@Lookup
	public abstract Student getStudent();
	
	public float getPercentage() {
	Student std=getStudent();
	int total=std.getM1()+std.getM2()+std.getM3();
	return total/3.0f;
	}

	
}
