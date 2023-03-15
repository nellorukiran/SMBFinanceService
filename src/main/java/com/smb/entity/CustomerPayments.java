package com.smb.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PAYMENT_DETAILS")
public class CustomerPayments {
	
	@Id
	@Column(name = "CUS_ID")
	private int customerId;
	
	@Column(name = "CUS_NAME")
	private String customerName;
	
	@Column(name = "ADDRESS")
	private String customerAddress;
	
	@Column(name = "ITEM_NAME")
	private String itemName;
	
	@Column(name = "BUY_DATE")
	private String itemBuyDate;
	
	@Column(name = "DUE_TIME")
	private String dueTime;
	
	@Column(name = "DUE_AMT")
	private int actualDueAmount;
	
	@Column(name = "TOT_DUES")
	private int noOfDues;
	
	@Column(name = "PER_DUE_AMT")
	private int eachDue;
	
	@Column(name = "PENALITY")
	private int panality;
	
	@Column(name = "NEXT_DUE_AMT")
	private int nextDueAmount;
		
	@Column(name = "PHONE")
	private String customerPhone;
	
	@Column(name = "REC_STATUS")
	private String fileStatus;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public int getNextDueAmount() {
		return nextDueAmount;
	}

	public void setNextDueAmount(int nextDueAmount) {
		this.nextDueAmount = nextDueAmount;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemBuyDate() {
		return itemBuyDate;
	}

	public void setItemBuyDate(String itemBuyDate) {
		this.itemBuyDate = itemBuyDate;
	}

	public String getDueTime() {
		return dueTime;
	}

	public void setDueTime(String dueTime) {
		this.dueTime = dueTime;
	}

	public int getActualDueAmount() {
		return actualDueAmount;
	}

	public void setActualDueAmount(int actualDueAmount) {
		this.actualDueAmount = actualDueAmount;
	}

	public int getNoOfDues() {
		return noOfDues;
	}

	public void setNoOfDues(int noOfDues) {
		this.noOfDues = noOfDues;
	}

	public int getEachDue() {
		return eachDue;
	}

	public void setEachDue(int eachDue) {
		this.eachDue = eachDue;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public int getPanality() {
		return panality;
	}

	public void setPanality(int panality) {
		this.panality = panality;
	}

	public String getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}
	
	
	
	

}
