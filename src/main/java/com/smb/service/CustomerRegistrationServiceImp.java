package com.smb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smb.bean.InjectBeanUtil;
import com.smb.controller.dao.CustomerRegistrationMapping;
import com.smb.entity.CustomerItemDetails;
import com.smb.entity.CustomerPayments;
import com.smb.entity.CustomerTransactions;
import com.smb.repository.CustomerItemDetailsRepository;
import com.smb.repository.CustomerPaymentsRepository;
import com.smb.repository.CustomerTransactionsRepository;

@Service
public class CustomerRegistrationServiceImp implements CustomerRegistrationService {

	@Autowired
	CustomerTransactionsRepository transactionsRepository;

	@Autowired
	CustomerPaymentsRepository customerPaymentsRepository;

	@Autowired
	CustomerItemDetailsRepository customerItemDetailsRepository;

	@Override
	public CustomerRegistrationMapping customerRegistration(CustomerRegistrationMapping customerRegisterMapping) {

		mappingTransactionDetails(customerRegisterMapping);
		mappingPaymentDetails(customerRegisterMapping);
		mappingItemDetails(customerRegisterMapping);

		return customerRegisterMapping;
	}

	private CustomerTransactions mappingTransactionDetails(CustomerRegistrationMapping customerRegisterMapping) {
		CustomerTransactions transaction = InjectBeanUtil.getTransaction();
		transaction.setCustomerId(customerRegisterMapping.getCustomerId());
		transaction.setCustomerName(customerRegisterMapping.getCustomerName());
		transaction.setCustomerAddress(customerRegisterMapping.getCustomerAddress());
		transaction.setItemName(customerRegisterMapping.getItemName());
		transaction.setItemBuyDate(customerRegisterMapping.getItemBuyDate());
		transaction.setDueTime(customerRegisterMapping.getDueTime());
		transaction.setActualItemCost(customerRegisterMapping.getActualItemCost());
		transaction.setActualDueAmount(customerRegisterMapping.getActualDueAmount());
		transaction.setNoOfDues(customerRegisterMapping.getNoOfDues());
		transaction.setEachDue(customerRegisterMapping.getEachDue());
		transaction.setCustomerPhone(customerRegisterMapping.getCustomerPhone());
		transaction.setDownPayment(customerRegisterMapping.getDownPayment());
		transaction.setBalanceDue(customerRegisterMapping.getBalanceDue());
		transaction.setShopName(customerRegisterMapping.getShopName());
		transaction.setModelName(customerRegisterMapping.getModelName());
		transaction.setDealPrice(customerRegisterMapping.getDealPrice());
		transaction.setProfit(customerRegisterMapping.getProfit());
		transaction.setPanality(customerRegisterMapping.getPanality());
		transaction.setTotalProfile(customerRegisterMapping.getTotalProfile());
		transaction.setBalanceDue(customerRegisterMapping.getBalanceDue());
		transaction.setIntrestAmount(customerRegisterMapping.getIntrestAmount());
		transaction.setDocumentCharges(customerRegisterMapping.getDocumentCharges());
		transaction.setPurchaseDate(customerRegisterMapping.getPurchaseDate());
		transaction.setFileStatus(customerRegisterMapping.getFileStatus());
		
		transactionsRepository.save(transaction);
		return transaction;
	}

	private CustomerPayments mappingPaymentDetails(CustomerRegistrationMapping customerRegisterMapping) {
		CustomerPayments payments = InjectBeanUtil.getPayments();
		payments.setCustomerId(customerRegisterMapping.getCustomerId());
		payments.setCustomerName(customerRegisterMapping.getCustomerName());
		payments.setCustomerAddress(customerRegisterMapping.getCustomerAddress());
		payments.setItemName(customerRegisterMapping.getItemName());
		payments.setItemBuyDate(customerRegisterMapping.getItemBuyDate());
		payments.setDueTime(customerRegisterMapping.getDueTime());
		payments.setActualDueAmount(customerRegisterMapping.getActualDueAmount());
		payments.setNoOfDues(customerRegisterMapping.getNoOfDues());
		payments.setEachDue(customerRegisterMapping.getEachDue());
		payments.setPenality(customerRegisterMapping.getPanality());
		payments.setNextDueAmount(customerRegisterMapping.getEachDue()+customerRegisterMapping.getPanality());
		payments.setCustomerPhone(customerRegisterMapping.getCustomerPhone());
		payments.setFileStatus(customerRegisterMapping.getFileStatus());
		
		customerPaymentsRepository.save(payments);
		return payments;
	}

	private CustomerItemDetails mappingItemDetails(CustomerRegistrationMapping customerRegisterMapping) {
		CustomerItemDetails itemDetails = InjectBeanUtil.getItemDetails();
		itemDetails.setCustomerId(customerRegisterMapping.getCustomerId());
		itemDetails.setCustomerName(customerRegisterMapping.getCustomerName());
		itemDetails.setItemBuyDate(customerRegisterMapping.getItemBuyDate());
		itemDetails.setItemName(customerRegisterMapping.getItemName());
		itemDetails.setShopName(customerRegisterMapping.getShopName());
		itemDetails.setModelName(customerRegisterMapping.getModelName());
		itemDetails.setDealPrice(customerRegisterMapping.getDealPrice());
		itemDetails.setSaledPrice(customerRegisterMapping.getSaledPrice());
		customerItemDetailsRepository.save(itemDetails);
		return itemDetails;
	}

}
