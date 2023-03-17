package com.smb.service;

import java.util.Optional;

import com.smb.entity.CustomerPayments;

public interface CustomerDeleteService {

	Optional<CustomerPayments> deletePayments(long cusId);

}
