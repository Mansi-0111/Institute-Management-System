package com.admin.bean;

public class FeedbackBean {

	Integer feedbackId;
	String descriptionF,feedbackRate,feedbackEmail;
	public Integer getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Integer feedbackId) {
		this.feedbackId = feedbackId;
	}
	
	public String getDescriptionF() {
		return descriptionF;
	}
	public void setDescriptionF(String descriptionF) {
		this.descriptionF = descriptionF;
	}
	public String getFeedbackRate() {
		return feedbackRate;
	}
	public void setFeedbackRate(String feedbackRate) {
		this.feedbackRate = feedbackRate;
	}
	public String getFeedbackEmail() {
		return feedbackEmail;
	}
	public void setFeedbackEmail(String feedbackEmail) {
		this.feedbackEmail = feedbackEmail;
	}
	
	
}
