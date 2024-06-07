package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.InquiryDao;
import com.admin.model.Inquiry;


@Service("inquiryService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class InquiryServiceImpl implements InquiryService {

	@Autowired
	private InquiryDao inquiryDao;
	
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addInquiry(Inquiry inquiry) {
		inquiryDao.addInquiry(inquiry);
	}
	//list
	public List<Inquiry> listInquirys() {
		return inquiryDao.listInquirys();
	}

	public Inquiry getInquiry(int inquiryid) {
		return inquiryDao.getInquiry(inquiryid);
	}
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteInquiry(Inquiry inquiry) {
		inquiryDao.deleteInquiry(inquiry);
	}
}
