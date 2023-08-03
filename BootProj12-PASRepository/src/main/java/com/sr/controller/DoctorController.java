package com.sr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sr.entity.Doctor;
import com.sr.service.DoctorService;

@Controller("Con")
public class DoctorController {
	@Autowired
	DoctorService service;
	
	public void getDoctor(boolean asc,String ...prop) {
		service.displaySortedDoctors(asc,prop);
	}

}
