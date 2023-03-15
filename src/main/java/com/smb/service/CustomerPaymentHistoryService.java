package com.smb.service;

import java.util.List;

import com.smb.entity.CustomerPaymentHistory;

public interface CustomerPaymentHistoryService {
	public List<CustomerPaymentHistory> getCustomerCustomerPaymentHistory();

	public List<CustomerPaymentHistory> getPaymentHistoryByCusId(Long cusId);
}
