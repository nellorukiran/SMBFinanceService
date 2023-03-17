package com.smb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smb.controller.dao.CustomerUpdationMapping;
import com.smb.service.CustomerUpdationService;

@RestController
@RequestMapping("/smb")
public class CustomerUpdationController {
	
	@Autowired
	CustomerUpdationService updationService;
	
	
	@PutMapping("/customerUpdation/{cusId}")
	public ResponseEntity<CustomerUpdationMapping> customerUpdation(@PathVariable long cusId,@RequestBody CustomerUpdationMapping customerUpdationMapping) {
		return new ResponseEntity<>(updationService.customerUpdation(cusId, customerUpdationMapping),HttpStatus.CREATED);
	}

}
