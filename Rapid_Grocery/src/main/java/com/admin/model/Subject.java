package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subject")
public class Subject {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name = "subject_id")
	private Integer subject_Id;
	
	@Column(name="subject_name")
	private String subject_Name;

	public Integer getSubject_Id() {
		return subject_Id;
	}

	public void setSubject_Id(Integer subject_Id) {
		this.subject_Id = subject_Id;
	}

	public String getSubject_Name() {
		return subject_Name;
	}

	public void setSubject_Name(String subject_Name) {
		this.subject_Name = subject_Name;
	}
	
	
}
