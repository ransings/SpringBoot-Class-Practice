package com.sr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Worker_Info")
public class Worker {
	@Id
	@SequenceGenerator(name = "worker_seq")
	@GeneratedValue(generator = "worker_seq")
	private Integer id;
	private String name;
	private String company;
	private Float salary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}
	
	
	

}
