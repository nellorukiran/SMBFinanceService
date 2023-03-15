package com.smb.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ITEM_DETAILS")
public class CustomerItemDetails {
	
	@Id
	@Column(name = "CUS_ID")
	private int customerId;
	
	@Column(name = "CUS_NAME")
	private String customerName;
	
	@Column(name = "BUY_DATE")
	private String itemBuyDate;
	
	@Column(name = "ITEM_NAME")
	private String itemName;
	
	@Column(name = "SHOP_NAME")
	private String shopName;
	
	@Column(name = "MODEL_NAME")
	private String modelName;
	
	@Column(name = "BUY_PRICE")
	private int dealPrice;
	
	@Column(name = "SALED_PRICE")
	private int saledPrice;
	
	@Column(name = "PROFIT")
	private int profit;

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

	public String getItemBuyDate() {
		return itemBuyDate;
	}

	public void setItemBuyDate(String itemBuyDate) {
		this.itemBuyDate = itemBuyDate;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public int getSaledPrice() {
		return saledPrice;
	}

	public void setSaledPrice(int saledPrice) {
		this.saledPrice = saledPrice;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	

}
