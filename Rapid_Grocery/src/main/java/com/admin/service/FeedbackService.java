package com.admin.service;

import java.util.List;

import com.admin.model.Feedback;

public interface FeedbackService {

	public void addFeedback(Feedback feedback);
	
	public List<Feedback> listFeedbacks() ;
	
	public Feedback getFeedback(int feedbackid) ;
	
	public void deleteFeedback(Feedback feedback);
}
