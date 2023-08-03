package com.sr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sr.controller.DoctorController;
import com.sr.entity.Doctor;

@SpringBootApplication
public class BootProj11JpaOperationsApplication {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean flag=true;
		String name,desg;
		int id,choice,records,docId;
		Doctor doc;
		List<Doctor> docList;
		List<Integer> docIds;
		Scanner sc=new Scanner(System.in);
		
		//creating container
		ApplicationContext ctx= SpringApplication.run(BootProj11JpaOperationsApplication.class, args);
		
		//accessing controller object
		DoctorController controller=ctx.getBean("controller",DoctorController.class);
		
		//chosing operation
		while(flag) {
			System.out.println("Select operation::\n1.Add_single\n2.Add_multiple\n3.Remove\n4.Remove_multiple");
			System.out.println("5.Update\n6.exit");
			choice=sc.nextInt();
			
			switch(choice) {
			//Add doctor
			case 1: System.out.println("Enter name and qualification");
					name=sc.next();
					desg=sc.next();
					doc=new Doctor();
					doc.setName(name);
					doc.setQualification(desg);
					try {
					System.out.println("Doctor:: "+controller.add(doc)+" is inserted");
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
					
			//add multiple doctors
			case 2:
				System.out.println("enter no of records to be inserted");
				records=sc.nextInt();
				docList=new ArrayList<Doctor>(records);
				for(int i=0;i<records;i++) {
				System.out.println("Record no:"+(i+1));
				System.out.println("Enter name and qualification");
				name=sc.next();
				desg=sc.next();
				doc=new Doctor();
				doc.setName(name);
				doc.setQualification(desg);
				docList.add(doc);	
				}
				
				try {
					System.out.println(controller.addAll(docList));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
				//delete by id
			case 3:
					System.out.println("Enter doctorId to delete");
					docId=sc.nextInt();
					
					try {
						controller.remove(docId);
						System.out.println("Doctor with id "+docId+" deleted successfully..");
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					break;
			
				case 4:
					System.out.println("enter no of records to be deleted");
					records = sc.nextInt();
					docIds = new ArrayList<Integer>(records);

					System.out.println("Enter "+records+" ids");
					for(int i=0;i<records;i++) {
						docIds.add(sc.nextInt());
					}
					try {
						controller.removeAll(docIds);
						System.out.println(records+" docs with given ids are deleted");
					}catch (Exception e) {
						e.printStackTrace();
					}
					break;
					
					//update doctor 
				case 5:
					System.out.println("Enter id to update");
					id = sc.nextInt();
					System.out.println("Enter name and qualification");
					name = sc.next();
					desg = sc.next();
					doc = new Doctor();
					doc.setId(id);
					doc.setName(name);
					doc.setQualification(desg);
					try {
						System.out.println("Doctor:: " + controller.update(doc) + " is updated");
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				
			case 6: flag=false;
					break;
					
			default: System.out.println("Invalid choice");
								
			}//switch
			
		}//while
		
		
	}

}
