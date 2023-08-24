package com.example.demo.module;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
	List<Employee> findByName (String name);
	List<Employee> findTop3ByAge (Integer num);
	List<Employee> findByNameIs(String name);
	List<Employee> findByNameEquals (String name);
	List<Employee> findByNameIsNot (String name);
	List<Employee> findByNameIsNull (); 
	List<Employee> findByNameIsNotNull ();
	List<Employee> findByNameStartingWith (String prefix);
	List<Employee> findByNameEndingWith (String suffix);
	List<Employee> findByNameContaining (String infix);
	List<Employee> findByNameLike (String likePattern);
	List<Employee> findByAgeLessThan (Integer age);
	List<Employee> findByAgeLessThanEqual (Integer age);
	List<Employee> findByAgeGreaterThan (Integer age); 
	List<Employee> findByAgeGreaterThanEqual (Integer age);
	List<Employee> findByAgeBetween (Integer startAge, Integer endAge);
	List<Employee> findByAgeIn (Collection<Integer> ages);
	List<Employee> findByBirthDateAfter (ZonedDateTime birthDate);
	List<Employee> findByBirthDateBefore (ZonedDateTime birthDate);
	List<Employee> findByNameOrBirthDate (String name, ZonedDateTime birthDate); 
	List<Employee> findByNameOrBirthDateAndActive (String name, ZonedDateTime birthDate, Boolean active);

   
}

