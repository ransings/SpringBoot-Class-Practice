package com.sr.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="JPA_STUDENT_INFO")
public class Student {
	@Id
	@Column(name="studentID")
	@GeneratedValue
	private Integer id;
	@Column(name="NAME")
	private String name;  
	@Column(name="Addr")
	private String Address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}

	
}
