package com.sr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sr.controller.WorkerController;

@SpringBootApplication
public class CrudOperationsApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(CrudOperationsApplication.class, args);
		
		WorkerController ctrl=ctx.getBean("cntrl",WorkerController.class);
		
		ctrl.manageWorker();
	}

}
