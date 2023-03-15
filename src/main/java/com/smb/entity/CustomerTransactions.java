package com.smb.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TRANSACTION_DETAILS")
public class CustomerTransactions {
	
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
	
	@Column(name = "TOT_PRICE")
	private int actualItemCost;
	
	@Column(name = "DUE_AMT")
	private int actualDueAmount;
	
	@Column(name = "TOT_DUES")
	private int noOfDues;
	
	@Column(name = "PER_DUE_AMT")
	private int eachDue;
	
	@Column(name = "PHONE")
	private String customerPhone;
	
	@Column(name = "ADVANCE")
	private int downPayment;
	
	@Column(name = "BAL_AMT")
	private int balanceDue;
	
	@Column(name = "SHOP_NAME")
	private String shopName;
	
	@Column(name = "MODEL_NAME")
	private String modelName;
	
	@Column(name = "BUY_PRICE")
	private int dealPrice;
	
	@Column(name = "PROFIT")
	private int profit;
	
	@Column(name = "PENALTY")
	private int panality;
	
	@Column(name = "TOT_PROFIT")
	private int totalProfile;
	
	@Column(name = "INTREST_AMT")
	private int intrestAmount;
	
	@Column(name = "DOC_AMT")
	private int documentCharges;
	
	@Column(name = "PURCHASE_DATE")
	private Date purchaseDate;
	
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

	public int getActualItemCost() {
		return actualItemCost;
	}

	public void setActualItemCost(int actualItemCost) {
		this.actualItemCost = actualItemCost;
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

	public int getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(int downPayment) {
		this.downPayment = downPayment;
	}

	public int getBalanceDue() {
		return balanceDue;
	}

	public void setBalanceDue(int balanceDue) {
		this.balanceDue = balanceDue;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getDealPrice() {
		return dealPrice;
	}

	public void setDealPrice(int dealPrice) {
		this.dealPrice = dealPrice;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public int getPanality() {
		return panality;
	}

	public void setPanality(int panality) {
		this.panality = panality;
	}

	public int getTotalProfile() {
		return totalProfile;
	}

	public void setTotalProfile(int totalProfile) {
		this.totalProfile = totalProfile;
	}

	public int getIntrestAmount() {
		return intrestAmount;
	}

	public void setIntrestAmount(int intrestAmount) {
		this.intrestAmount = intrestAmount;
	}

	public int getDocumentCharges() {
		return documentCharges;
	}

	public void setDocumentCharges(int documentCharges) {
		this.documentCharges = documentCharges;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(String fileStatus) {
		this.fileStatus = fileStatus;
	}
	
	
	
	

}
