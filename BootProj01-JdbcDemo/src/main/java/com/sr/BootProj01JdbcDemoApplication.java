package com.sr;

import java.io.Closeable;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.sr.controller.EmpController;
import com.sr.controller.EmpControllerImpl;
import com.sr.sbeans.Employee;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication

@EnableAutoConfiguration
public class BootProj01JdbcDemoApplication {
	
	/*
	 * @Bean public DataSource createDataSource() { HikariDataSource ds= new
	 * HikariDataSource(); ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	 * ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
	 * ds.setUsername("shubham"); ds.setPassword("manager"); return ds;
	 * 
	 * }
	 */

	public static void main(String[] args) {
		//create container
		ApplicationContext ctx= SpringApplication.run(BootProj01JdbcDemoApplication.class, args);
		
		//create scanner object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee name,desgn,salary::");
		String name=sc.next();
		String desg=sc.next();
		float salary=sc.nextFloat();
		sc.close();
		
		//get Employee Object
		Employee emp=ctx.getBean("employee",Employee.class);
		emp.setDesg(desg);
		emp.setName(name);
		emp.setSalary(salary);
		
		//get Controller class object
		EmpController ctrl=ctx.getBean("controller",EmpControllerImpl.class);
		try {
			ctrl.manageEmployee(emp);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();
		
		
	}

}
