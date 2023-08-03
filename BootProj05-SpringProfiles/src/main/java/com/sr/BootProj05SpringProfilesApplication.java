package com.sr;

import java.beans.PropertyVetoException;

import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sr.sbeans.Demo;
import com.sr.sbeans.EmpController;
import com.sr.sbeans.Employee;
import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
public class BootProj05SpringProfilesApplication {
	@Autowired
	Demo demo;
	
	@Profile("hk")
	@Bean
	public HikariDataSource dataSource() {
		Environment env=demo.getEnv();
		HikariDataSource ds=new HikariDataSource();
		ds.setDriverClassName(env.getProperty("class"));
		ds.setJdbcUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("username"));
		ds.setPassword(env.getProperty("password"));
		
		return ds;
	}

	@Profile("c3p0")
	@Bean
	public ComboPooledDataSource c3p0DataSource() throws PropertyVetoException {
		Environment env=demo.getEnv();
		ComboPooledDataSource ds=new ComboPooledDataSource();
		System.out.println(env.getProperty("url"));
		ds.setDriverClass(env.getProperty("class"));
		ds.setJdbcUrl(env.getProperty("url"));
		ds.setUser(env.getProperty("username"));
		ds.setPassword(env.getProperty("password"));
		
		return ds;		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ApplicationContext ctx=SpringApplication.run(BootProj05SpringProfilesApplication.class, args);
		EmpController ctr=ctx.getBean("controller",EmpController.class);
		String name,desg;
		Double salary;
		Employee emp=null;
		
		System.out.println("Enter name,designation and salary of employee");
		name=sc.next();
		desg=sc.next();
		salary=sc.nextDouble();
		
		emp.setName(name);
		emp.setDesg(desg);
		emp.setSalary(salary);
		
		try {
			System.out.println(ctr.employeeManagement(emp));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
