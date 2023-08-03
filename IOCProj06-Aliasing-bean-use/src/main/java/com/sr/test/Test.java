package com.sr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sr.beans.Driving;
import com.sr.beans.Vehicle;

public class Test {

	public static void main(String[] args) {
		// create Spring Container
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/sr/cfgs/applicationContext.xml");
		
		//creating Drive object
		Driving dr=ctx.getBean("driving",Driving.class);
		
		dr.driveCar();
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
