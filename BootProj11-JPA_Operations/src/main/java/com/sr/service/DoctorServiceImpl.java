package com.sr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.dao.DoctorDAO;
import com.sr.entity.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	DoctorDAO dao;
	
	@Override
	public Doctor add(Doctor doc) {	
		return dao.save(doc);
	}

	@Override
	public Iterable<Doctor> addAll(List<Doctor> docs) {
		return dao.saveAll(docs);
	}

	@Override
	public void remove(int docId) {
		dao.deleteById(docId);
	}

	@Override
	public void removeAll(List<Integer> docs) {
		dao.deleteAllById(docs);;
	}

	@Override
	public Doctor update(Doctor doc) {
		Optional<Doctor> opt=dao.findById(doc.getId());
		Doctor d1=opt.get();
		d1.setName(doc.getName());
		d1.setQualification(doc.getQualification());
		return dao.save(d1);
	}

}
