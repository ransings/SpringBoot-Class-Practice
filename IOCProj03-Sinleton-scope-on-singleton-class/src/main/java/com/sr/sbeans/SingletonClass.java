package com.sr.sbeans;

import org.springframework.stereotype.Component;

@Component("singleton")
public class SingletonClass {
	private static SingletonClass obj=null;

	private SingletonClass() {
		super();
	}
	
	public static SingletonClass getInstance() {
		if(obj==null)
		   obj=new SingletonClass();
		return obj;
	}
	
	
}
