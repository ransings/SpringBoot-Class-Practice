package com.sr.sbeans;

import org.springframework.stereotype.Component;

//@Component  annotations does not provide support for method replacer 
//as there is no annotation for method replacer
public class OriginalClass {

	public String method(String name,int number) {
		return "This is Method of "+getClass()+" with parameter value "+name;
	}
	
}
