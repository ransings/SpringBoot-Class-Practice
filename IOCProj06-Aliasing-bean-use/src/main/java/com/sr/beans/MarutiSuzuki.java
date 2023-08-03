package com.sr.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("ms")
@Primary
public class MarutiSuzuki implements Vehicle {

	@Override
	public void drive() {
		System.out.println("Driving Maruti Suziki Vehicle");

	}

}
