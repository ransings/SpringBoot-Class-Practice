package com.sr.beans;

import org.springframework.stereotype.Component;

@Component("dEngg")
public class DieselEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Diesel Engine started");

	}

	@Override
	public void stop() {
		System.out.println("Diesel Engine stopped");
	}

}
