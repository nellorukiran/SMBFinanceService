package com.smb.entity;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SMB_USER_PROFILE")
public class UserProfile {
	
	@Id
	@Column(name = "USER_TYPE")
	private int customerId;
	
	@Column(name = "CREATE_DATE")
	private Date createDate;
	
	@Column(name = "USER_NAME")
	private String userName;
	
	@Column(name = "USER_PASSWORD")
	private String password;
	
	@Column(name = "USER_PASSWORD_DUPLICATE")
	private String shopName;
	
	@Column(name = "FIRST_NAME")
	private String duplicatePassword;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getDuplicatePassword() {
		return duplicatePassword;
	}

	public void setDuplicatePassword(String duplicatePassword) {
		this.duplicatePassword = duplicatePassword;
	}

	
}
