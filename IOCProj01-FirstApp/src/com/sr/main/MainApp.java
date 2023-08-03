package com.sr.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sr.beans.WishMessageGenerator;

public class MainApp {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/sr/cfgs/applicationContext.xml");
		
		WishMessageGenerator msg=ctx.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(msg.generateWishMessage("Shubham"));
		ctx.close();

	}

}
