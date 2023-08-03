package com.sr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.dao.EmployeeDao;
import com.sr.sbeans.Employee;

@Service("service")
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmployeeDao dao;
	
	@Override
	public String calculateSalary(Employee emp) throws Exception {
		emp.setSalary(emp.getSalary()+1000);
		
		//return insertion of data in table message
		
		return dao.insert(emp)>0?"Record Inserted Successfully.."+emp.toString():"Internal Problem:: Try Again";
	}

}
