package com.smb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smb.entity.CustomerPayments;
import com.smb.repository.CustomerPaymentsRepository;

@Service
public class CustomerDeleteServiceImp implements CustomerDeleteService {

	@Autowired
	CustomerPaymentsRepository paymentsRepository;
	
	@Override
	public Optional<CustomerPayments> deletePayments(long cusId) {
		Optional<CustomerPayments> payments = paymentsRepository.findById(cusId);
		if(payments.isPresent()) {
			paymentsRepository.deleteById(cusId);
		}
		return payments;
	}

}
