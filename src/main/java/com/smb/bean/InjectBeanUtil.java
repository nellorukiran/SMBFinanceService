package com.smb.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.smb.entity.CustomerItemDetails;
import com.smb.entity.CustomerPaymentHistory;
import com.smb.entity.CustomerPayments;
import com.smb.entity.CustomerTransactions;

@Service
public class InjectBeanUtil {

	@Bean
	public static CustomerTransactions getTransaction() {
		return new CustomerTransactions();
	}

	@Bean
	public static CustomerPayments getPayments() {
		return new CustomerPayments();
	}

	@Bean
	public static CustomerItemDetails getItemDetails() {
		return new CustomerItemDetails();
	}
	
	@Bean
	public static CustomerPaymentHistory getIPaymentHistory() {
		return new CustomerPaymentHistory();
	}
}
