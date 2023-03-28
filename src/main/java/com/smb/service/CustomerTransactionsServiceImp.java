package com.smb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.smb.controller.dao.RequiredResponse;
import com.smb.entity.CustomerTransactions;
import com.smb.entity.LoginUser;
import com.smb.exceptions.EmptyInputException;
import com.smb.repository.CustomerTransactionsRepository;

@Service
public class CustomerTransactionsServiceImp implements CustomerTransactionsService{
	
	@Autowired
	CustomerTransactionsRepository transactionsRepository;

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public List<CustomerTransactions> getCustomerTransactionsDetails() {
		return transactionsRepository.findAll();
	}

	@Override
	public Optional<CustomerTransactions> getTransactionByCusId(Long cusId) {
		Optional<CustomerTransactions> customerTransactions = transactionsRepository.findById(cusId);
		return customerTransactions;
	}

	@Override
	public RequiredResponse smbuserdetails(Long cusId) {
		
		RequiredResponse response = new RequiredResponse();
		Optional<CustomerTransactions> customerTransactions = transactionsRepository.findById(cusId);
		response.setTransaction(customerTransactions);
	    @SuppressWarnings("unchecked")
		java.util.List<LoginUser> user =	restTemplate.getForObject("http://USER-SERVICE/smbUser/verifyUser/hani", List.class);
		response.setUser(user);
	    return response;
	}

}
