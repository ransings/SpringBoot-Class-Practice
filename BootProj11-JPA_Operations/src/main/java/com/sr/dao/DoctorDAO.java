package com.sr.dao;

import org.springframework.data.repository.CrudRepository;

import com.sr.entity.Doctor;

public interface DoctorDAO extends CrudRepository<Doctor, Integer> {
	
}
