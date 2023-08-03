package com.sr.beans;

import org.springframework.stereotype.Component;

@Component("ford")
public class Ford implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Driving Ford Vehicle");

	}

}
