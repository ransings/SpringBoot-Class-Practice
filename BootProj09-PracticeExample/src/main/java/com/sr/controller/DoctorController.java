package com.sr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sr.entity.Doctor;
import com.sr.service.DoctorService;

@Controller("controller")
public class DoctorController {
	@Autowired
	DoctorService service;
	
	public Doctor manageDoctor(Doctor dr) {
		return service.addDoctor(dr);
		
	}
}
