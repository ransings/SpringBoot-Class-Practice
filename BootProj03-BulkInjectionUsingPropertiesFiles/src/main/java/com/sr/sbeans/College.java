package com.sr.sbeans;

public class College {
	private int id;
	private String name;
	private String addr;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}
	
	
}
