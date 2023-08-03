package com.sr.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sr.sbeans.SingletonClass;

public class SingletonClassTest {

	public static void main(String[] args) {
		// crete IOC Container

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/sr/cfgs/ApplicationContext.xml");

		// get singleton class object configured using annotation approach
		SingletonClass sc = ctx.getBean("singleton", SingletonClass.class);
		SingletonClass sc1 = ctx.getBean("singleton", SingletonClass.class);

		// get singleton class object configured using factory method approach
		SingletonClass xm1 = ctx.getBean("single", SingletonClass.class);
		SingletonClass xm2 = ctx.getBean("single", SingletonClass.class);

		//create
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		System.out.println("\t\t\tConfiguring Singleton Class as Spring Bean\n");
		System.out.println("------------------------------------------------------------------------------------------------------------------------------\n\n");

		// checking objects are same for obj managed by IOC container
		System.out.println("IOC container created objects by annotation");
		System.out.println("Hashcodes::");
		System.out.println(sc.hashCode()+"  "+sc1.hashCode());
		System.out.println("sc==sc1? " + (sc == sc1));
		System.out.println("==========================================================");

		// checking objects are same for obj managed by IOC container
		System.out.println("IOC container created objects by factory method");
		System.out.println("Hashcodes::");
		System.out.println(xm1.hashCode()+"  "+xm2.hashCode());
		System.out.println("xm1==xm2? " + (xm1 == xm2));
		System.out.println("==========================================================");

		// checking objects are same for obj created manually
		System.out.println("Manually created objects by calling getInstance()");
		System.out.println("Hashcodes::");
		System.out.println(obj1.hashCode()+"  "+obj2.hashCode());
		System.out.println("obj1==obj2? " + (obj1 == obj2));
		System.out.println("==========================================================");

		// checking objects are same for obj managed by IOC container
		System.out.println("Annotation created object and manully created object");
		System.out.println("Hashcodes::");
		System.out.println(sc.hashCode()+"  "+obj1.hashCode());
		System.out.println("sc==obj1? " + (sc == obj1));
		System.out.println("==========================================================");

		// checking objects are same for obj managed by IOC container
		System.out.println("IOC factory method created object and manual factory method object");
		System.out.println("Hashcodes::");
		System.out.println(xm1.hashCode()+"  "+obj1.hashCode());
		System.out.println("xm1==obj1? " + (xm1 == obj1));
		System.out.println("==========================================================");

	}

}
