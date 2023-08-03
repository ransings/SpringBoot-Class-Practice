package com.sr.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("engg")
	Engine engine;

	public void drive() {
		engine.start();
		System.out.println("Vehicle started driving");
		engine.stop();
	}
}
