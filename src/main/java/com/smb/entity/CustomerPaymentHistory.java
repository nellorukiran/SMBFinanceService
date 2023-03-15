package com.smb.entity;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="PAYMENT_HISTORY")
public class CustomerPaymentHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DUE_NO")
	private int dueNo;
	
	@Column(name = "CUS_ID")
	private int customerId;
	
	@Column(name = "DUE_DATE")
	private String dueDate;
	
	@Column(name = "PAID_AMT")
	private int paidAmount;
	
	@Column(name = "PAY_DATE")
	private Date payDate;
	
	@Column(name = "BAL_DUE")
	private int balanceDue;

	public int getDueNo() {
		return dueNo;
	}

	public void setDueNo(int dueNo) {
		this.dueNo = dueNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public int getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(int paidAmount) {
		this.paidAmount = paidAmount;
	}

	public Date getPayDate() {
		return payDate;
	}

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}

	public int getBalanceDue() {
		return balanceDue;
	}

	public void setBalanceDue(int balanceDue) {
		this.balanceDue = balanceDue;
	}
	

}
