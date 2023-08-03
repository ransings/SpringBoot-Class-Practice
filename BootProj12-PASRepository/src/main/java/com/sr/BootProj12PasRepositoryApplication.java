package com.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sr.controller.DoctorController;

@SpringBootApplication
public class BootProj12PasRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootProj12PasRepositoryApplication.class, args);
		
		DoctorController controlle=ctx.getBean("Con",DoctorController.class);
		
		controlle.getDoctor(false,"name");
		
		((ConfigurableApplicationContext) ctx).close();
		
		
	}

}
