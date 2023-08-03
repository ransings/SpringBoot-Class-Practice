package com.sr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sr.cfgs.ConfigurationClass;
import com.sr.sbeans.WishMessageGenerator;

public class SpringConfigTest {

	public static void main(String[] args) {
		//create container
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		
		WishMessageGenerator wmg=ctx.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(wmg.generateWishMessage("Shubham"));

	}

}
