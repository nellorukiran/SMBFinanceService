package com.smb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smb.entity.CustomerTransactions;
import com.smb.entity.Student;
import com.smb.service.CustomerItemDetailsService;
import com.smb.service.CustomerPaymentHistoryService;
import com.smb.service.CustomerPaymentsService;
import com.smb.service.CustomerTransactionsService;

@RestController
@RequestMapping("/smb")
public class RegisterCustomerController {
	
	@Autowired
	CustomerTransactionsService transactionsService;
	
	@Autowired
	CustomerPaymentsService paymentService;
	
	@Autowired
	CustomerPaymentHistoryService historyService;
	
	@Autowired
	CustomerItemDetailsService itemDetailsService;
	
	@PostMapping("/customerRegistration")
	public ResponseEntity<CustomerTransactions> registerCustomer(@RequestBody CustomerTransactions customerTransactions) {
		return new ResponseEntity<>(transactionsService.registerCustomer(customerTransactions),HttpStatus.CREATED);
	}

}
