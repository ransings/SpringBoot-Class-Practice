package com.sr.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	@Qualifier("ldt2")
	LocalDateTime ldt;
	
	public String genrateWishMessage(String usr) {
		int hour=ldt.getHour();
		System.out.println(ldt);
		
		if(hour<12)
			return "Good Morning "+usr;
		if(hour<15)
			return "Good Afternoon "+usr;
		if(hour<20)
			return "Good Evening "+usr;
		else
			return "Good Night "+usr;

	}
	

}

