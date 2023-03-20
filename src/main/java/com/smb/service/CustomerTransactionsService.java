package com.smb.service;

import java.util.List;
import java.util.Optional;

import com.smb.controller.dao.RequiredResponse;
import com.smb.entity.CustomerTransactions;

public interface CustomerTransactionsService {
	public List<CustomerTransactions> getCustomerTransactionsDetails();

	public Optional<CustomerTransactions> getTransactionByCusId(Long cusId);

	public RequiredResponse smbuserdetails(Long cusId);
}
