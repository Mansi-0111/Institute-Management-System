package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="payment_traction")

public class Fee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "payment_id")
	private Integer payment_Id;
	
	@Column(name = "usermaster_id")
	private Integer user_master_Id;
	
	@Column(name = "course_name")
	private String course_Name;
	
	@Column(name="order_id")
	private String order_Id;
	
	@Column(name="payment_date")
	private String payment_Date;
	
	@Column(name="amount")
	private Integer fee_Amount;

	public Integer getPayment_Id() {
		return payment_Id;
	}

	public void setPayment_Id(Integer payment_Id) {
		this.payment_Id = payment_Id;
	}

	
	public Integer getUsermaster_Id() {
		return user_master_Id;
	}

	public void setUsermaster_Id(Integer usermaster_Id) {
		this.user_master_Id = usermaster_Id;
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

	public Integer getFee_Amount() {
		return fee_Amount;
	}

	public void setFee_Amount(Integer fee_Amount) {
		this.fee_Amount = fee_Amount;
	}
	
	
}

