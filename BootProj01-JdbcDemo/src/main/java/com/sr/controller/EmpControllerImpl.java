package com.sr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sr.sbeans.Employee;
import com.sr.service.EmpService;

@Controller("controller")
public class EmpControllerImpl implements EmpController {
	@Autowired
	EmpService service;

	@Override
	public void manageEmployee(Employee e) throws Exception {
		System.out.println(service.calculateSalary(e));
		
	}
}
