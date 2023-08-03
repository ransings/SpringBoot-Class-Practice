package com.sr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sr.sbeans.OriginalClass;

public class MethodReplacerTest {

	public static void main(String[] args) {
		// create IOC Container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/sr/cfgs/applicationContext.xml");
		OriginalClass oc=ctx.getBean("org",OriginalClass.class);
		
		System.out.println(oc.method("Shubham Ransing",100));
		
	}

}
