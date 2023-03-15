package com.smb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smb.entity.CustomerItemDetails;

public interface CustomerItemDetailsRepository extends JpaRepository<CustomerItemDetails, Long> {
	
}
