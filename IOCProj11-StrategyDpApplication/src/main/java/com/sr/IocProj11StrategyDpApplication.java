package com.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.sr.beans.Vehicle;

@SpringBootApplication
@ImportResource("classpath:com/sr/cfgs/applicationContext.xml")
public class IocProj11StrategyDpApplication {

	public static void main(String[] args) {
		//creating container
		ApplicationContext ctx= SpringApplication.run(IocProj11StrategyDpApplication.class, args);
		//creating vehicle object
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);

		//calling business method
		vehicle.drive();
		
		((ConfigurableApplicationContext) ctx).close();


	}

}
