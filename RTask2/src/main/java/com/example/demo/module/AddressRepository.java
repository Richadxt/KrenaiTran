package com.example.demo.module;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{
	public List<Address> findByCityAndStateAndPincodeAndEmployee_Salary(String city, String state, String pincode, Double salary);

}
