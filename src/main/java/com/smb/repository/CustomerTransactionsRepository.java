package com.smb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smb.entity.CustomerTransactions;

public interface CustomerTransactionsRepository extends JpaRepository<CustomerTransactions, Long> {
	
}
