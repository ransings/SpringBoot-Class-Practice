package com.sr.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_Info")
public class Employee {
	@Id
	@Column(name="id")
	@SequenceGenerator(name = "Employee_seq" )
	private Integer id;
	private String name;
	private String desg;
	private Float salary;

}
