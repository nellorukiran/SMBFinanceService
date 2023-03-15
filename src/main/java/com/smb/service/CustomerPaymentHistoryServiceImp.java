package com.smb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smb.entity.CustomerPaymentHistory;
import com.smb.repository.CustomerPaymentHistoryRepository;

@Service
public class CustomerPaymentHistoryServiceImp implements CustomerPaymentHistoryService{
	
	@Autowired
	CustomerPaymentHistoryRepository paymentHistoryRepository;

	@Override
	public List<CustomerPaymentHistory> getCustomerCustomerPaymentHistory() {
		return paymentHistoryRepository.findAll();
	}
	
	@Override
	public List<CustomerPaymentHistory> getPaymentHistoryByCusId(Long cusId) {
		return paymentHistoryRepository.findByCustomerId(cusId);
	}

}
