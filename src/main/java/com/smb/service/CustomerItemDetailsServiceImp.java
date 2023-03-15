package com.smb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smb.entity.CustomerItemDetails;
import com.smb.repository.CustomerItemDetailsRepository;

@Service
public class CustomerItemDetailsServiceImp implements CustomerItemDetailsService{
	
	@Autowired
	CustomerItemDetailsRepository customerItemDetailsRepository;

	@Override
	public List<CustomerItemDetails> getCustomerCustomerItemDetails() {
		return customerItemDetailsRepository.findAll();
	}

}
