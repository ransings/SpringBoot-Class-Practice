package com.sr;

import java.io.Closeable;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

import com.sr.controller.DoctorController;
import com.sr.entity.Doctor;

@SpringBootApplication
public class BootProj09PracticeExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj09PracticeExampleApplication.class, args);
		Scanner sc= new Scanner(System.in);
		
		Doctor dr=new Doctor();
		
		//accepting doctor properties
		System.out.println("Enter Doctor name and qualification");
		String name=sc.next();
		String qualification=sc.next();
		
		dr.setName(name);
		dr.setQualification(qualification);
		
		//getting spring bean
		DoctorController controller=ctx.getBean("controller",DoctorController.class);
		
		System.out.println("After inserting records doctor::"+controller.manageDoctor(dr));
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
