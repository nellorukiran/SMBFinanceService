package com.smb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smb.entity.CustomerPayments;
import com.smb.service.CustomerDeleteService;

@RestController
@RequestMapping("/smb")
public class CustomerDeleteController {
	
	@Autowired
	CustomerDeleteService deleteService;
	
	@DeleteMapping("/deletePayments/{cusId}")
	public ResponseEntity<Void> deletePayments(@PathVariable long cusId) {
		Optional<CustomerPayments> payments = deleteService.deletePayments(cusId);
		if(payments.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
