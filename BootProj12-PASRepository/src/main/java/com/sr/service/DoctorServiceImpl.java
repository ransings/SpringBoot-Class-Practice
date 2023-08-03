package com.sr.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.sr.dao.DoctorDAO;
import com.sr.entity.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorDAO dao;

	@Override
	public void displaySortedDoctors(boolean asc,String ...prop) {
		System.out.println("Dao class is::"+dao.getClass());
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,prop);
		Iterable<Doctor> docs= dao.findAll(sort);
		docs.forEach(d->{System.out.println(d.getId()+"\t"+d.getName()+"\t"+d.getQualification());});
	}

	

}
