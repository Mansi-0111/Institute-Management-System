package com.admin.bean;

import java.time.LocalDate;

public class FeeBean {

	
	
	Integer payment_Id,user_master_Id,fee_Amount,course_Id;
	String course_Name,order_Id,payment_Date;
	
	
	
	public Integer getCourse_Id() {
		return course_Id;
	}
	public void setCourse_Id(Integer course_Id) {
		this.course_Id = course_Id;
	}
	public Integer getPayment_Id() {
		return payment_Id;
	}
	public void setPayment_Id(Integer payment_Id) {
		this.payment_Id = payment_Id;
	}
	public Integer getUser_master_Id() {
		return user_master_Id;
	}
	public void setUser_master_Id(Integer user_master_Id) {
		this.user_master_Id = user_master_Id;
	}
	public Integer getFee_Amount() {
		return fee_Amount;
	}
	public void setFee_Amount(Integer fee_Amount) {
		this.fee_Amount = fee_Amount;
	}
	public String getCourse_Name() {
		return course_Name;
	}
	public void setCourse_Name(String course_Name) {
		this.course_Name = course_Name;
	}
	public String getOrder_Id() {
		return order_Id;
	}
	public void setOrder_Id(String order_Id) {
		this.order_Id = order_Id;
	}
	public String getPayment_Date() {
		return payment_Date;
	}
	public void setPayment_Date(String payment_Date) {
		this.payment_Date = payment_Date;
	}
	
	
	
	
}
