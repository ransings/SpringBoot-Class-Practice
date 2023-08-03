package com.sr.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("employee")
@ConfigurationProperties()
@Profile(value = {"emp"})
public class Employee implements Person {
	private int id;
	private String name;
	private String desg;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Desg=" + desg + "]";
	}
	
	
	
	

}
