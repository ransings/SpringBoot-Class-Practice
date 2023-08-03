package com.sr.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("student")
@ConfigurationProperties()
@Profile("std")
public class Student implements Person {
	private int id;
	private String name;
	private String occupation;
	
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
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", occupation=" + occupation + "]";
	}
	
	
	
}
