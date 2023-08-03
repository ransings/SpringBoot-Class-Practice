package com.sr.beans;

import org.springframework.stereotype.Component;

@Component("pEngg")
public class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Pertol Engine started");

	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine stopped");
	}

}
