package com.sr.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sr.sbeans.WishMessageGenerator;

public class MainClass {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/sr/cfgs/applicationContext.xml");
		WishMessageGenerator wmg= ctx.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(wmg.genrateWishMessage("Shubham"));

	}

}
