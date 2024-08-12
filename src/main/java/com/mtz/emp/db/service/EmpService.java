package com.mtz.emp.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtz.emp.db.entity.Employee;
import com.mtz.emp.db.repo.EmpRepo;

@Service
public class EmpService {

	@Autowired
	EmpRepo empRepo;
	
	public Employee insertNewEmp(Employee emp) {
		
		return empRepo.save(emp);
	}

}
