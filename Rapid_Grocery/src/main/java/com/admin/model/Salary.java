package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="salary")
public class Salary {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "salary_id")
	private Integer salary_Id;
	
	@Column(name = "user_master_id")
	private Integer user_master_Id;
	
	@Column(name = "salary_amount")
	private Integer salary_Amount;
	
	@Column(name = "salary_date")
	private String salary_Date;

	public Integer getSalary_Id() {
		return salary_Id;
	}

	public void setSalary_Id(Integer salary_Id) {
		this.salary_Id = salary_Id;
	}

	public Integer getUser_master_Id() {
		return user_master_Id;
	}

	public void setUser_master_Id(Integer user_master_Id) {
		this.user_master_Id = user_master_Id;
	}

	public Integer getSalary_Amount() {
		return salary_Amount;
	}

	public void setSalary_Amount(Integer salary_Amount) {
		this.salary_Amount = salary_Amount;
	}

	public String getSalary_Date() {
		return salary_Date;
	}

	public void setSalary_Date(String salary_Date) {
		this.salary_Date = salary_Date;
	}

	
	
	
}
