package com.smb.controller.dao;

import java.util.List;
import java.util.Optional;

import com.smb.entity.CustomerTransactions;
import com.smb.entity.LoginUser;


public class RequiredResponse {
	private Optional<CustomerTransactions> transaction;
	private List<LoginUser> user;

	

	public Optional<CustomerTransactions> getTransaction() {
		return transaction;
	}

	public void setTransaction(Optional<CustomerTransactions> transaction) {
		this.transaction = transaction;
	}

	public List<LoginUser> getUser() {
		return user;
	}

	public void setUser(List<LoginUser> user) {
		this.user = user;
	}

	

	
	
	
}
