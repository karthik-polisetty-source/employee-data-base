package com.mtz.emp.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class EmployeeDataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDataBaseApplication.class, args);
	}

}
