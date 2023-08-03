package com.sr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="JPA_Doctor")
public class Doctor {
	@Id
	@Column(name="id")
	@GeneratedValue
	private Integer id;
	@Column(name="name")
	private String name;	
	@Column
	private String qualification;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", qualification=" + qualification + "]";
	}
	
	

}
