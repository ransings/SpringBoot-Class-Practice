package com.sr.sbeans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class EmpDAOImpl implements EmpDAO{
@Autowired
DataSource ds;
private final String QUERY="INSERT INTO EMPLOYEE VALUES(EMPID.NEXTVAL,?,?,?)";


@Override
	public int insertEmployee(Employee emp) throws SQLException {
		Connection con=ds.getConnection();
		PreparedStatement ps=con.prepareStatement(QUERY);
		ps.setString(1, emp.getName());
		ps.setString(2, emp.getDesg());
		ps.setDouble(3, emp.getSalary());
		return ps.executeUpdate();
	}
}
