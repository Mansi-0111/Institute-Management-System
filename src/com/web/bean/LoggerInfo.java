package com.web.bean;

public class LoggerInfo {

	int user_master_id, user_type_id;
	String userName, userEmail,userPassword,userAddress, userContact;
	
	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUser_master_id() {
		return user_master_id;
	}

	public void setUser_master_id(int user_master_id) {
		this.user_master_id = user_master_id;
	}

	public int getUser_type_id() {
		return user_type_id;
	}

	public void setUser_type_id(int user_type_id) {
		this.user_type_id = user_type_id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
}
