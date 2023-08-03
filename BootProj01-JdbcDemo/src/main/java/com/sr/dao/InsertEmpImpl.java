package com.sr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sr.sbeans.Employee;

@Repository("dao")
public class InsertEmpImpl implements EmployeeDao {
	private static final String query="INSERT INTO EMPLOYEE VALUES (EMPID.nextval,?,?,?)";
	@Autowired
	DataSource ds;
	
	@Override
	public int insert(Employee e) throws SQLException {
		
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setString(1,e.getName() );
		ps.setString(2, e.getDesg());
		ps.setFloat(3, e.getSalary());
		
		return ps.executeUpdate();
	}

}
