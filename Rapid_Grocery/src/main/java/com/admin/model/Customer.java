package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "cid")
	private Integer c_id;
	
	@Column(name="cname")
	private String c_name;
	
	@Column(name="caddress")
	private String c_address;

	@Column(name="ccontact")
	private Integer c_contact;
	
	@Column(name="cemail")
	private String c_email;

	public Integer getC_id() {
		return c_id;
	}

	public void setC_id(Integer c_id) {
		this.c_id = c_id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public String getC_address() {
		return c_address;
	}

	public void setC_address(String c_address) {
		this.c_address = c_address;
	}

	public Integer getC_contact() {
		return c_contact;
	}

	public void setC_contact(Integer c_contact) {
		this.c_contact = c_contact;
	}

	public String getC_email() {
		return c_email;
	}

	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	
}
