package com.smb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smb.controller.dao.CustomerRegistrationMapping;
import com.smb.service.CustomerRegistrationService;

@RestController
@RequestMapping("/smb")
public class CustomerRegistrationController {
	
		
	@Autowired
	CustomerRegistrationService registrationService;
	
	
	@PostMapping("/customerRegistration")
	public ResponseEntity<CustomerRegistrationMapping> customerRegistration(@RequestBody CustomerRegistrationMapping customerRegisterMapping) {
		return new ResponseEntity<>(registrationService.customerRegistration(customerRegisterMapping),HttpStatus.CREATED);
	}

}
