package com.sr.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("person")
public class ProfileDemo {
	@Autowired
	private Person p;

	@Override
	public String toString() {
		return "Person [p=" + p + "]";
	}
	
}
