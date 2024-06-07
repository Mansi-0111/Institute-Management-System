package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Inquiry")
public class Inquiry {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "inquiryid")
	private Integer inquiryId;
	
	@Column(name="inquiryname")
	private String inquiryName;
	
	@Column(name="inquiryadd")
	private String inquiryAdd;
	
	@Column(name="inquiryquery")
	private String inquiryQuery;
	
	@Column(name="inquirymail")
	private String inquiryMail;

	public Integer getInquiryId() {
		return inquiryId;
	}

	public void setInquiryId(Integer inquiryId) {
		this.inquiryId = inquiryId;
	}

	public String getInquiryName() {
		return inquiryName;
	}

	public void setInquiryName(String inquiryName) {
		this.inquiryName = inquiryName;
	}

	public String getInquiryAdd() {
		return inquiryAdd;
	}

	public void setInquiryAdd(String inquiryAdd) {
		this.inquiryAdd = inquiryAdd;
	}

	public String getInquiryQuery() {
		return inquiryQuery;
	}

	public void setInquiryQuery(String inquiryQuery) {
		this.inquiryQuery = inquiryQuery;
	}

	public String getInquiryMail() {
		return inquiryMail;
	}

	public void setInquiryMail(String inquiryMail) {
		this.inquiryMail = inquiryMail;
	}
	
	
}
