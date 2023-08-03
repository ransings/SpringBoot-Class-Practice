package com.sr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.dao.DoctorDAO;
import com.sr.entity.Doctor;

@Service("service")
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorDAO dao;

	@Override
	public Doctor addDoctor(Doctor dr) {
		System.out.println("Doctor to be inserted::"+dr);
		dr=dao.save(dr);
		return dr;
	}

}
