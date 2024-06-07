package com.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "feedbackid")
	private Integer feedbackId;
	
	@Column(name="description")
	private String descriptionF;
	
	@Column(name="feedbackrate")
	private String feedbackRate;
	
	@Column(name="feedbackemail")
	private String feedbackEmail;

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
