package com.smb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smb.controller.dao.RequiredResponse;
import com.smb.entity.CustomerItemDetails;
import com.smb.entity.CustomerPaymentHistory;
import com.smb.entity.CustomerPayments;
import com.smb.entity.CustomerTransactions;
import com.smb.service.CustomerItemDetailsService;
import com.smb.service.CustomerPaymentHistoryService;
import com.smb.service.CustomerPaymentsService;
import com.smb.service.CustomerTransactionsService;

@RestController
@RequestMapping("/smb")
public class GetCustomerController {
	
	@Autowired
	CustomerTransactionsService transactionsService;
	
	@Autowired
	CustomerPaymentsService paymentService;
	
	@Autowired
	CustomerPaymentHistoryService historyService;
	
	@Autowired
	CustomerItemDetailsService itemDetailsService;

	@GetMapping("/transactionDetails")
	public ResponseEntity<List<CustomerTransactions>> getTransactionDetails(){
		return new ResponseEntity<>(transactionsService.getCustomerTransactionsDetails(),HttpStatus.OK);
	}
	
	@GetMapping("/smbuserdetails/{cusId}")
	public ResponseEntity<RequiredResponse> smbuserdetails(@PathVariable Long cusId){
		return new ResponseEntity<RequiredResponse>(transactionsService.smbuserdetails(cusId),HttpStatus.OK);
	}
	
	@GetMapping("/transactionDetails/{cusId}")
	public ResponseEntity<CustomerTransactions> getTransactionDetailsByCusId(@PathVariable Long cusId){
		Optional<CustomerTransactions> customerTransactions = transactionsService.getTransactionByCusId(cusId);
		if(customerTransactions.isPresent()) {
			return new ResponseEntity<>(customerTransactions.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/paymentDetails")
	public ResponseEntity<List<CustomerPayments>> getPaymentDetails(){
		return new ResponseEntity<>(paymentService.getCustomerCustomerPayments(),HttpStatus.OK);
	}
	
	@GetMapping("/paymentDetails/{cusId}")
	public ResponseEntity<CustomerPayments> getPaymentDetailsByCusId(@PathVariable Long cusId){
		Optional<CustomerPayments> customerPayments = paymentService.getPaymentDetailsByCusId(cusId);
		if(customerPayments.isPresent()) {
			return new ResponseEntity<>(customerPayments.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/paymentHistory")
	public ResponseEntity<List<CustomerPaymentHistory>> getPaymentHistory(){
		return new ResponseEntity<>(historyService.getCustomerCustomerPaymentHistory(),HttpStatus.OK);
	}
	
	@GetMapping("/paymentHistory/{cusId}")
	public ResponseEntity<List<CustomerPaymentHistory>> getPaymentHistoryByCusId(@PathVariable Long cusId){
		return new ResponseEntity<>(historyService.getPaymentHistoryByCusId(cusId),HttpStatus.OK);
	}
	
	@GetMapping("/itemDetails")
	public ResponseEntity<List<CustomerItemDetails>> getItemDetails(){
		return new ResponseEntity<>(itemDetailsService.getCustomerCustomerItemDetails(),HttpStatus.OK);
	}
}
