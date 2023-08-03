package com.sr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sr.sbeans.StudentResult;

public class AwareInjectionTest {

	public static void main(String arg[]) {
		ApplicationContext ctx1=new ClassPathXmlApplicationContext("com/sr/cfgs/applicationContext.xml");
		System.out.println("Ctx1:"+ctx1.hashCode());
		StudentResult s1=ctx1.getBean("rslt",StudentResult.class);
		System.out.println("Result ::"+s1.getPercentage());
		
		ApplicationContext ctx2=new ClassPathXmlApplicationContext("com/sr/cfgs/applicationContext.xml");
		System.out.println("Ctx2:"+ctx2.hashCode());
		StudentResult s2=ctx2.getBean("rslt",StudentResult.class);
		System.out.println("Result ::"+s2.getPercentage());

	}
}
