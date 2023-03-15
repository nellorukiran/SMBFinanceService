package com.smb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smb.entity.CustomerPayments;

public interface CustomerPaymentsRepository extends JpaRepository<CustomerPayments, Long> {
	
}
