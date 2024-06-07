package com.admin.service;

import java.util.List;

import com.admin.model.Inquiry;

public interface InquiryService {

	public void addInquiry(Inquiry inquiry);
	
	public List<Inquiry> listInquirys();
	
	public Inquiry getInquiry(int inquiryid);
	
	public void deleteInquiry(Inquiry inquiry);
}
