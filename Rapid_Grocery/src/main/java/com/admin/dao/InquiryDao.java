package com.admin.dao;

import java.util.List;

import com.admin.model.Inquiry;

public interface InquiryDao {
	
	public void addInquiry(Inquiry inquiry);
	
	public List<Inquiry> listInquirys();
	
	public Inquiry getInquiry(int inquiryid) ;
	
	public void deleteInquiry(Inquiry inquiry);
}

