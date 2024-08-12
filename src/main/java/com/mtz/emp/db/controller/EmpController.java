package com.mtz.emp.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtz.emp.db.entity.Employee;
import com.mtz.emp.db.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/mtz/emp/add")
	public Employee addNewEmp(@RequestBody Employee emp) {
		
		return empService.insertNewEmp(emp);
		
	}

}
