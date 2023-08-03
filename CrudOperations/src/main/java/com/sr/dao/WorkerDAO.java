package com.sr.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sr.entity.Worker;

public interface WorkerDAO extends JpaRepository<com.sr.entity.Worker, Integer> {
	
	public List<Worker> getByName(String name);

}
