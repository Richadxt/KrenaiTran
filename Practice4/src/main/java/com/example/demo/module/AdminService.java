package com.example.demo.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	public Admin registerAdmin(Admin admin) {
	    return adminRepository.save(admin);
	}


}
