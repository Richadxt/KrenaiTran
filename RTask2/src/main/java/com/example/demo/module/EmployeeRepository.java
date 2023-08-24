package com.example.demo.module;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	public List<Employee> findByAgeAndSalaryAndJoiningDateBefore(Long age, Double salary, Date joiningDate);
}
