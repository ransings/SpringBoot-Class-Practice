package com.sr.service;

import java.util.List;

import com.sr.entity.Worker;

public interface WorkerService {
	public Worker insert(Worker wk);
	public void delete(int id);
	public Worker update(Worker worker);
	public Worker display(Worker worker);
	public List<Worker> displayAll();
	public List<Worker> getByName(String name);

}
