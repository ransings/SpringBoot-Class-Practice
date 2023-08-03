package com.sr.sbeans;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service")
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpDAO dao;

	@Override
	public String manageEmployee(Employee emp) throws SQLException {
		int records=dao.insertEmployee(emp);
		return records>0?"Records are inserted Successfully":"Something went wrong please try again...";
	}

	
}
