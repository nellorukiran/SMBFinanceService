package com.smb.service;

import java.util.List;
import java.util.Optional;

import com.smb.entity.CustomerPayments;

public interface CustomerPaymentsService {
	public List<CustomerPayments> getCustomerCustomerPayments();

	public Optional<CustomerPayments> getPaymentDetailsByCusId(Long cusId);
}
