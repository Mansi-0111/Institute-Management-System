package com.admin.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.Feedback;

@Repository("feedbackDao")
public class FeedbackDaoImpl implements FeedbackDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void addFeedback(Feedback feedback) {
		sessionFactory.getCurrentSession().saveOrUpdate(feedback);
	}

	@SuppressWarnings("unchecked")
	public List<Feedback> listFeedbacks() {
		return (List<Feedback>) sessionFactory.getCurrentSession().createCriteria(Feedback.class).list();
	}

	public Feedback getFeedback(int feedbackid) {
		return (Feedback) sessionFactory.getCurrentSession().get(Feedback.class, feedbackid);
	}
	
	public void deleteFeedback(Feedback feedback) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM Feedback WHERE feedbackId = "+feedback.getFeedbackId()).executeUpdate();
	}
}
