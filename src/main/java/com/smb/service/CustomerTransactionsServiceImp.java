package com.smb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smb.entity.CustomerTransactions;
import com.smb.repository.CustomerTransactionsRepository;

@Service
public class CustomerTransactionsServiceImp implements CustomerTransactionsService{
	
	@Autowired
	CustomerTransactionsRepository transactionsRepository;

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
	public CustomerTransactions registerCustomer(CustomerTransactions customerTransactions) {
		CustomerTransactions savedTransactions = transactionsRepository.save(customerTransactions);
		return savedTransactions;
	}

}
