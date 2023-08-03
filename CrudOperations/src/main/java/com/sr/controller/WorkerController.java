package com.sr.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sr.entity.Worker;
import com.sr.service.WorkerService;

@Controller("cntrl")
public class WorkerController {
	@Autowired
	private WorkerService service;
	private Scanner sc=new Scanner(System.in);
	
	public void manageWorker() {
		Worker wk=new Worker();
		boolean flag=true;
		
		while(flag) {
			System.out.println("Enter Operation...");
			System.out.println("1.insert\n2.display\n3.update\n4.delete\n5.exit\n");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1: 
				System.out.print("Enter Name:: ");
				wk.setName(sc.next());
				System.out.print("\nEnter Company Name:: ");
				wk.setCompany(sc.next());
				System.out.print("\nEnter Salary:: ");
				wk.setSalary(sc.nextFloat());
				
				System.out.println("\n\nInserted "+service.insert(wk).toString()+"\n");	
				break;
			
			case 2: 
				System.out.println("Select Operation\n 1.All Workers\n 2.Workers By Name\n ");
				choice=sc.nextInt();
				
				switch (choice) {
				case 1: 
					List<Worker> list=service.displayAll();
					list.stream().forEach(d->{System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getCompany()+"\t"+d.getSalary());});

					break;
					
				case 2:
					System.out.print("Enter name:: ");
					String name=sc.next();
					list=service.getByName(name);
					
					list.stream().forEach(d->{System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getCompany()+"\t"+d.getSalary());});
					break;
				
		
				default:
					System.out.println("Invalid Selection");
				}
				
				break;
				
			case 3:
				System.out.print("Enter Id:: ");
				wk.setId(sc.nextInt());
				System.out.print("\nEnter Name:: ");
				wk.setName(sc.next());
				System.out.print("\nEnter Company Name:: ");
				wk.setCompany(sc.next());
				System.out.print("\nEnter Salary:: ");
				wk.setSalary(sc.nextFloat());		
				System.out.println("Updated "+service.update(wk));
				
				break;
			
				
			case 4:
				System.out.println("Enter Id to delete::");
				int id=sc.nextInt();
				service.delete(id);
				break;
				
			case 5:
				flag=false;				
				break;
			
			default:
				System.out.println("Invalid Input Try Again...");
				
			}
			
			
		}
		
		
	}

}
