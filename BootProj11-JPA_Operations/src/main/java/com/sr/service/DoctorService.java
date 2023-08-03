package com.sr.service;

import java.util.List; 

import com.sr.entity.Doctor;

public interface DoctorService {
	public Doctor add(Doctor doc);
	public Iterable<Doctor> addAll(List<Doctor> docs);
	public void remove(int doc);
	public void removeAll(List<Integer> docs);
	public Doctor update(Doctor doc);
	
}
