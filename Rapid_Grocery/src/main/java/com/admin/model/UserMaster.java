package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity   
@Table(name="usermaster")
public class UserMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "user_master_id")
	private Integer user_master_Id;
	
	@Column(name = "user_type_id")
	private Integer user_type_Id;
	
	@Column(name = "course_id")
	private Integer course_Id;
	
	@Column(name="user_fname")
	private String user_Fname;
	
	@Column(name="user_lname")
	private String user_Lname;
	
	@Column(name="user_address")
	private String user_Address;
	
	@Column(name="user_gender")
	private String user_Gender;
	
	@Column(name="user_contact")
	private String user_Contact;
	
	@Column(name="user_email")
	private String user_Email;
	
	@Column(name="user_dob")
	private String user_Dob;
	
	
	
	@Column(name="user_addmissiondate")
	private String user_Addmissiondate;
	
	@Column(name="user_qualification")
	private String user_Qualification;
	
	@Column(name="user_password")
	private String user_Password;
	
	@Column(name="user_parentfname")
	private String user_Parentfname;
	
	
	
	@Column(name="user_parentemail")
	private String user_Parentemail;
	
	@Column(name="user_parentcontact")
	private String user_ParentContact;
	
	
	
	public Integer getUser_master_Id() {
		return user_master_Id;
	}

	public void setUser_master_Id(Integer user_master_Id) {
		this.user_master_Id = user_master_Id;
	}

	
	public Integer getUser_type_Id() {
		return user_type_Id;
	}

	public void setUser_type_Id(Integer user_type_Id) {
		this.user_type_Id = user_type_Id;
	}

	public Integer getCourse_Id() {
		return course_Id;
	}

	public void setCourse_Id(Integer course_Id) {
		this.course_Id = course_Id;
	}

	public String getUser_Fname() {
		return user_Fname;
	}

	public void setUser_Fname(String user_Fname) {
		this.user_Fname = user_Fname;
	}

	public String getUser_Lname() {
		return user_Lname;
	}

	public void setUser_Lname(String user_Lname) {
		this.user_Lname = user_Lname;
	}

	public String getUser_Address() {
		return user_Address;
	}

	public void setUser_Address(String user_Address) {
		this.user_Address = user_Address;
	}

	public String getUser_Gender() {
		return user_Gender;
	}

	public void setUser_Gender(String user_Gender) {
		this.user_Gender = user_Gender;
	}

	public String getUser_Contact() {
		return user_Contact;
	}

	public void setUser_Contact(String user_Contact) {
		this.user_Contact = user_Contact;
	}

	public String getUser_Email() {
		return user_Email;
	}

	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}

	public String getUser_Dob() {
		return user_Dob;
	}

	public void setUser_Dob(String user_Dob) {
		this.user_Dob = user_Dob;
	}

	

	public String getUser_Addmissiondate() {
		return user_Addmissiondate;
	}

	public void setUser_Addmissiondate(String user_Addmissiondate) {
		this.user_Addmissiondate = user_Addmissiondate;
	}

	public String getUser_Qualification() {
		return user_Qualification;
	}

	public void setUser_Qualification(String user_Qualification) {
		this.user_Qualification = user_Qualification;
	}

	public String getUser_Password() {
		return user_Password;
	}

	public void setUser_Password(String user_Password) {
		this.user_Password = user_Password;
	}

	public String getUser_Parentfname() {
		return user_Parentfname;
	}

	public void setUser_Parentfname(String user_Parentfname) {
		this.user_Parentfname = user_Parentfname;
	}

	
	public String getUser_Parentemail() {
		return user_Parentemail;
	}

	public void setUser_Parentemail(String user_Parentemail) {
		this.user_Parentemail = user_Parentemail;
	}

	public String getUser_ParentContact() {
		return user_ParentContact;
	}

	public void setUser_ParentContact(String user_ParentContact) {
		this.user_ParentContact = user_ParentContact;
	}

	
	

}
