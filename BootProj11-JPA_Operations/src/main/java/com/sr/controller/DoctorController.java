package com.sr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sr.entity.Doctor;
import com.sr.service.DoctorService;

@Controller("controller")
public class DoctorController {
	@Autowired
	DoctorService service;
	

	public Doctor add(Doctor doc) {	
		return service.add(doc);
	}

	
	public Iterable<Doctor> addAll(List<Doctor> docs) {
		return service.addAll(docs);
	}

	
	public void remove(int doc) {
	 service.remove(doc);
	}

	public void removeAll(List<Integer> docs) {
		service.removeAll(docs);
	}

	public Doctor update(Doctor doc) {
		return service.update(doc);
	}

}
