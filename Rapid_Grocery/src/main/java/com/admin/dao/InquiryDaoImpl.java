package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Inquiry;

@Repository("inquiryDao")
public class InquiryDaoImpl implements InquiryDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addInquiry(Inquiry inquiry) {
		sessionFactory.getCurrentSession().saveOrUpdate(inquiry);
	}

	@SuppressWarnings("unchecked")
	public List<Inquiry> listInquirys() {
		return (List<Inquiry>) sessionFactory.getCurrentSession().createCriteria(Inquiry.class).list();	}

	public Inquiry getInquiry(int inquiryid) {
		return (Inquiry) sessionFactory.getCurrentSession().get(Inquiry.class, inquiryid);
	}
	
	public void deleteInquiry(Inquiry inquiry) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Inquiry WHERE inquiryId = "+inquiry.getInquiryId()).executeUpdate();
	}
}
