package com.smb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smb.entity.CustomerPaymentHistory;

public interface CustomerPaymentHistoryRepository extends JpaRepository<CustomerPaymentHistory, Long> {
	
	public List<CustomerPaymentHistory> findByCustomerId(Long cusId);
	
}
