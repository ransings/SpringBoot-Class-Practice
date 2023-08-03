package com.sr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.dao.StudentDAO;
import com.sr.entity.Student;

@Service("service")
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;

	@Override
	public Student registerStudent(Student std) {
		System.out.println("Before save:: "+std);
		std=dao.save(std);
		System.out.println("After Save:: "+std);
		return std;
	}

}
