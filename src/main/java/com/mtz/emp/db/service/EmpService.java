package com.mtz.emp.db.service;

import java.util.List;

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

	public List<Employee> postAllRecords(List<Employee> empList) {
		
		return empRepo.saveAll(empList);
	}

	public List<Employee> fetchAllRecords() {
		
		return empRepo.findAll();
	}

	public String deleteUser(int eid) {
		
		return null;
	}

	

}
