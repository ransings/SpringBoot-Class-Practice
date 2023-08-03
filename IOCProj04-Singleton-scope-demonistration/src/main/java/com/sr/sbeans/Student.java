package com.sr.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("std")
@Scope("prototype")
public class Student {
 private int roll_no;

public int getRoll_no() {
	return roll_no;
}

public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
 
 
}
