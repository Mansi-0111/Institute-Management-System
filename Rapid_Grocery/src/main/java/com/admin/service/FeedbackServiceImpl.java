package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.FeedbackDao;
import com.admin.model.Feedback;

@Service("feedbackService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)

public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackDao feedbackDao;//object create thay
	
	
	//add
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addFeedback(Feedback feedback) {
		feedbackDao.addFeedback(feedback);
	}
	//list
	public List<Feedback> listFeedbacks() {
		return feedbackDao.listFeedbacks();
	}

	public Feedback getFeedback(int feedbackid) {
		return feedbackDao.getFeedback(feedbackid);
	}
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void deleteFeedback(Feedback feedback) {
		feedbackDao.deleteFeedback(feedback);
	}

}
