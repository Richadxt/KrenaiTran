package com.example.demo.module;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Employee;

@Service
public class EmployeeService {
	
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    
// ################################################################3
    
        public List<Employee> findByName(String name) {
            return employeeRepository.findByName(name);
        }

        public List<Employee> findTop3ByAge(Integer num) {
            return employeeRepository.findTop3ByAge(num);
        }

        public List<Employee> findByNameIs(String name) {
            return employeeRepository.findByNameIs(name);
        }
        
        public List<Employee> findByNameEquals (String name) {
          return employeeRepository.findByNameEquals(name);
        }
        
        public List<Employee> findByNameIsNot(String name) {
            return employeeRepository.findByNameIsNot(name);
        }
        
        public List<Employee> findByNameIsNull () {
            return employeeRepository.findByNameIsNull();
        }
        
        public List<Employee> findByNameIsNotNull () {
            return employeeRepository.findByNameIsNotNull();
        }
        
        public List<Employee> findByNameStartingWith (String prefix){
            return employeeRepository.findByNameStartingWith(prefix);
        }
        
        public List<Employee> findByNameEndingWith (String suffix) {
            return employeeRepository.findByNameEndingWith(suffix);
        }
        
        public List<Employee> findByNameContaining (String infix){
            return employeeRepository.findByNameContaining(infix);
        }
        
        public List<Employee> findByNameLike (String likePattern) {
            return employeeRepository.findByNameLike(likePattern);
        }
        
        public List<Employee> findByAgeLessThan (Integer age) {
            return employeeRepository.findByAgeLessThan(age);
        }
        
        public List<Employee> findByAgeLessThanEqual (Integer age){
            return employeeRepository.findByAgeLessThanEqual(age);
        }
        
        public List<Employee> findByAgeGreaterThan (Integer age){
            return employeeRepository.findByAgeGreaterThan(age);
        }
        
        public List<Employee> findByAgeGreaterThanEqual (Integer age) {
            return employeeRepository.findByAgeGreaterThanEqual(age);
        }
        
        public List<Employee> findByAgeBetween (Integer startAge, Integer endAge){
            return employeeRepository.findByAgeBetween(startAge, endAge);
        }

        public List<Employee> findByAgeIn(Collection<Integer> ages) {
            return employeeRepository.findByAgeIn(ages);
        }

        public List<Employee> findByBirthDateAfter(ZonedDateTime birthDate) {
            return employeeRepository.findByBirthDateAfter(birthDate);
        }

        public List<Employee> findByBirthDateBefore(ZonedDateTime birthDate) {
            return employeeRepository.findByBirthDateBefore(birthDate);
        }

        public List<Employee> findByNameOrBirthDate(String name, ZonedDateTime birthDate) {
            return employeeRepository.findByNameOrBirthDate(name, birthDate);
        }

        public List<Employee> findByNameOrBirthDateAndActive(String name, ZonedDateTime birthDate, Boolean active) {
       	return employeeRepository.findByNameOrBirthDateAndActive(name, birthDate, active);
        }
  
}
