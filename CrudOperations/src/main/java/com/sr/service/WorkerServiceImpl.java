package com.sr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.dao.WorkerDAO;
import com.sr.entity.Worker;

@Service
public class WorkerServiceImpl implements WorkerService {
	@Autowired
	WorkerDAO dao;
	
	@Override
	public Worker insert(Worker worker) {
		System.out.println("WorkerServiceImpl.insert()");
		return dao.save(worker);
	}

	@Override
	public void delete(int id) {
		dao.deleteById(id);
		System.out.println("Deleted.....");
	}

	@Override
	public Worker update(Worker worker) {
		return dao.save(worker);
	}

	@Override
	public Worker display(Worker worker) {
		// TODO Auto-generated method stub
		return dao.getReferenceById(worker.getId());
	}

	@Override
	public List<Worker> displayAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Worker> getByName(String name) {
		return dao.getByName(name);
	}

}
