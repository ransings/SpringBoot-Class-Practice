package com.sr.sbeans;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class EmpController {
	@Autowired
	private EmpService service;
	
	public String employeeManagement(Employee emp)throws SQLException {
		return service.manageEmployee(emp);
	}

}
