package com.sr.sbeans;

import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {

	private Integer id;
	private String name;
	private String Desg;
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
	
	public String getDesg() {
		return Desg;
	}
	
	public void setDesg(String desg) {
		Desg = desg;
	}
	
	public Float getSalary() {
		return salary;
	}
	
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Desg=" + Desg + ", salary=" + salary + "]";
	}
	
}
