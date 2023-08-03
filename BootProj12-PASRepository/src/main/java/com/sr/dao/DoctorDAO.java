package com.sr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.sr.entity.Doctor;

public interface DoctorDAO extends JpaRepository<Doctor,Integer>{

}
