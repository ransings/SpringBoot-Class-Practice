package com.sr.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component
public class Student {

	public Student() {
		super();
		System.out.println("Student:: 0-param Constructor");
	}
	

}
