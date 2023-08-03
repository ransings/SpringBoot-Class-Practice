package com.sr.sbeans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("student")
@ConfigurationProperties(prefix ="ind.stud")
public class Student {
	private int rollNo;
	private String name;
	private double percentage;
	
	private String nickNames[];
	private Set contacts; 
	private List colors;
	
	private Map iProof;
	private College clg;


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public void setNickNames(String[] nickNames) {
		this.nickNames = nickNames;
	}

	public void setContacts(Set contacts) {
		this.contacts = contacts;
	}

	public void setColors(List colors) {
		this.colors = colors;
	}

	public void setiProof(Map iProof) {
		this.iProof = iProof;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", nickNames="
				+ Arrays.toString(nickNames) + ", contacts=" + contacts + ", colors=" + colors + ", iProof=" + iProof
				+ ", clg=" + clg + "]";
	}

	

}
