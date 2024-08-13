package com.mtz.emp.db.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mtz.emp.db.entity.Employee;
import com.mtz.emp.db.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	@PostMapping("/mtz/emp/add")
	public Employee addNewEmp(@RequestBody Employee emp) {
		
		System.out.println("from post man--->"+emp);
		
		return empService.insertNewEmp(emp);
		
	}
	
	@PostMapping("/mtz/emp/all")
	public List<Employee> allEmpList(@RequestBody List<Employee> empList){
		
		System.out.println("from post man ---->"+empList);
		
		return empService.postAllRecords(empList);
	}
	
	@GetMapping("/mtz/emp/all/records")
	public List<Employee> getAllUsers(){
		
     return empService.fetchAllRecords();
     
	}
	
	@DeleteMapping("/mtz/emp/delete")
	public String deleteUser(@RequestParam int eid) {
		
		return empService.deleteUser(eid);
	}
	

}
