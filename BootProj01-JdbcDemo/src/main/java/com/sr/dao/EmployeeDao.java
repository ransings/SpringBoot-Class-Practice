package com.sr.dao;

import java.sql.SQLException;

import com.sr.sbeans.Employee;

public interface EmployeeDao {

	public int insert(Employee e)throws SQLException;
}
