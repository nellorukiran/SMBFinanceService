package com.smb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smb.bean.InjectBeanUtil;
import com.smb.controller.dao.CustomerUpdationMapping;
import com.smb.entity.CustomerPaymentHistory;
import com.smb.entity.CustomerPayments;
import com.smb.entity.CustomerTransactions;
import com.smb.repository.CustomerPaymentHistoryRepository;
import com.smb.repository.CustomerPaymentsRepository;
import com.smb.repository.CustomerTransactionsRepository;

@Service
public class CustomerUpdationServiceImp implements CustomerUpdationService{
	
	@Autowired
	CustomerTransactionsRepository transactionsRepository;

	@Autowired
	CustomerPaymentsRepository paymentsRepository;

	@Autowired
	CustomerPaymentHistoryRepository paymentHistoryRepository;

	@Override
	public CustomerUpdationMapping customerUpdation(Long cusId, CustomerUpdationMapping updationMapping) {
		mappingTransactionUpdation(cusId, updationMapping);
		mappingPaymentUpdation(cusId, updationMapping);
		mappingPaymentHistoryInsert(cusId, updationMapping);

		return updationMapping;
	}

	private void mappingTransactionUpdation(Long cusId, CustomerUpdationMapping updationMapping) {
		
		Optional<CustomerTransactions> updateTransaction = transactionsRepository.findById(cusId);
		if(updateTransaction.isPresent()){
			updateTransaction.get().setFileStatus("U");
			transactionsRepository.save(updateTransaction.get());
		}
	}
	private void mappingPaymentUpdation(Long cusId, CustomerUpdationMapping updationMapping) {
		Optional<CustomerPayments> updatePayments = paymentsRepository.findById(cusId);
		if(updatePayments.isPresent()){
			updatePayments.get().setActualDueAmount(updationMapping.getBalanceDue());
			updatePayments.get().setNoOfDues(updationMapping.getPendingDues());
			updatePayments.get().setNextDueAmount(updationMapping.getNextDueAmount());
			updatePayments.get().setCustomerPhone(updationMapping.getCustomerPhone());
			updatePayments.get().setPenality(updationMapping.getPenality());
			updatePayments.get().setFileStatus("U");
			paymentsRepository.save(updatePayments.get());
		}
	}
	private void mappingPaymentHistoryInsert(Long cusId, CustomerUpdationMapping updationMapping) {
		CustomerPaymentHistory paymentHistory = InjectBeanUtil.getIPaymentHistory();
		paymentHistory.setCustomerId(cusId);
		paymentHistory.setDueDate(updationMapping.getDueDate().toString());
		paymentHistory.setPaidAmount(updationMapping.getDueAmount());
		paymentHistory.setPayDate(updationMapping.getDueDate());
		paymentHistory.setBalanceDue(updationMapping.getBalanceDue());
		paymentHistoryRepository.save(paymentHistory);
	}

}
