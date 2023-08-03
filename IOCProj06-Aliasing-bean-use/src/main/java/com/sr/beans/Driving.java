package com.sr.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("driving")
public class Driving {
	
	@Autowired
	@Qualifier("vehicle")
	private Vehicle v;
	
	public void driveCar() {
		v.drive();
	}
}
