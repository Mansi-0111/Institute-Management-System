package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usertype")
public class UserType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "user_type_id")
	private Integer user_type_Id;
	
	@Column(name="user_type_name")
	private String user_type_Name;


	public Integer getUser_type_Id() {
		return user_type_Id;
	}

	public void setUser_type_Id(Integer user_type_Id) {
		this.user_type_Id = user_type_Id;
	}

	public String getUser_type_Name() {
		return user_type_Name;
	}

	public void setUser_type_Name(String user_type_Name) {
		this.user_type_Name = user_type_Name;
	}
}