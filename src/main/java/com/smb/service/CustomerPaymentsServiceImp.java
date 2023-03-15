package com.smb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smb.entity.CustomerPayments;
import com.smb.repository.CustomerPaymentsRepository;

@Service
public class CustomerPaymentsServiceImp implements CustomerPaymentsService{
	
	@Autowired
	CustomerPaymentsRepository customerPaymentsRepository;

	@Override
	public List<CustomerPayments> getCustomerCustomerPayments() {
		return customerPaymentsRepository.findAll();
	}

	@Override
	public Optional<CustomerPayments> getPaymentDetailsByCusId(Long cusId) {
		Optional<CustomerPayments> customerPayments = customerPaymentsRepository.findById(cusId);
		return customerPayments;
	}

}
