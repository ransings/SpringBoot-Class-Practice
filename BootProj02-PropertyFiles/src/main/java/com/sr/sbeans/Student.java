package com.sr.sbeans;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("student")
@PropertySource("classpath:applicationContext.properties")
public class Student {
	@Value("${ind.stud.rollNo}")
	private int rollNo;
	@Value("${ind.stud.name}")
	private String name;
	@Value("${ind.stud.percentage}")
	private double percentage;
	
	@Value("ind.stud.nNames")
	private String nickNames[];
	@Value("ind.stud.contacts")
	private Set contacts;
	@Value("ind.stud.colors")
	private List colors;
	
	
	@Autowired
	private College clg;

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", nickNames="
				+ Arrays.toString(nickNames) + ", contacts=" + contacts + ", colors=" + colors + ", clg=" + clg + "]";
	}
	
}
