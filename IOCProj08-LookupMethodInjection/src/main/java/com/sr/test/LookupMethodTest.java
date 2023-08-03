package com.sr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sr.sbeans.StudentResult;

public class LookupMethodTest {

	public static void main(String arg[]) {
		ApplicationContext ctx1=new ClassPathXmlApplicationContext("com/sr/cfgs/applicationContext.xml");
		StudentResult s1=ctx1.getBean("rslt",StudentResult.class);
		System.out.println("ClassNane: "+s1.getClass());
		System.out.println("Result :: "+s1.getPercentage());
		
	}
}
