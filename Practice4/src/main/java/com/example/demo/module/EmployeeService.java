package com.example.demo.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;

@Service
public class EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public Employee registerEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
}
