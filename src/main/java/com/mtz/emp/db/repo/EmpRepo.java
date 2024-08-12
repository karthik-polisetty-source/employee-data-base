package com.mtz.emp.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtz.emp.db.entity.Employee;


public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
