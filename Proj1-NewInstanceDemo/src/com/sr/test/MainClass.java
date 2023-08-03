package com.sr.test;

import java.lang.reflect.Constructor;

public class MainClass {

	public static void main(String[] args)throws Exception {
		Class c=Class.forName(args[0]);
		
		Constructor cons[]=c.getDeclaredConstructors();
		
		Object obj=cons[0].newInstance();
		
		System.out.println(obj.toString());
		
		
	}

}
