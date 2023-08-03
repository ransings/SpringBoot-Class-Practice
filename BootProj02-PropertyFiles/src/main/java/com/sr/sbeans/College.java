package com.sr.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:applicationContext.properties")
@Component("college")
public class College {
	@Value("${org.ins.id}")
	private int id;
	@Value("${org.ins.name}")
	private String name;
	@Value("${org.ins.addr}")
	private String Addr;
	
	
	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", Addr=" + Addr + "]";
	}
		
}
