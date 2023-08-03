package com.sr.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("std")
//@PropertySource("com/sr/commons/info.properties")
public class Student {
	@Value("${id}")
	private int id;
	@Value("${name}")
	private String name;
	@Value("${fees}")
	private Double feesPaid;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getFeesPaid() {
		return feesPaid;
	}
	
	
	
}
