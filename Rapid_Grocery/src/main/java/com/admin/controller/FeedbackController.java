package com.admin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.admin.bean.FeedbackBean;
import com.admin.model.Feedback;
import com.admin.service.FeedbackService;

@Controller
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;
	
	@RequestMapping(value = "/savefeedback", method = RequestMethod.POST)
	public ModelAndView saveFeedback(@ModelAttribute("feedback") FeedbackBean feedbackBean, 
			BindingResult result) {
		Feedback feedback=prepareModel(feedbackBean);
		feedbackService.addFeedback(feedback);
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("feedbacks",  prepareListofBean(feedbackService.listFeedbacks()));
		return new ModelAndView("FeedbackListing",model);//redirect hoi to method nu name
	}
	
	@RequestMapping(value = "/addfeedback", method = RequestMethod.GET)
	public ModelAndView addFeedback(@ModelAttribute("feedback") FeedbackBean feedbackBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("feedbacks",  prepareListofBean(feedbackService.listFeedbacks()));
		return new ModelAndView("FeedbackAdd",model);//redirect no hoi to jsp page
	}
	
	@RequestMapping(value="/feedbacks", method = RequestMethod.GET)
	public ModelAndView listFeedbacks() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("feedbacks",  prepareListofBean(feedbackService.listFeedbacks()));
		return new ModelAndView("FeedbackListing", model);
	}
	
	@RequestMapping(value = "/deletefeedback", method = RequestMethod.GET)
	public ModelAndView editFeedback(@ModelAttribute("feedback")  FeedbackBean feedbackBean,
			BindingResult result) {
		feedbackService.deleteFeedback(prepareModel(feedbackBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("feedback", null);
		model.put("feedbacks",  prepareListofBean(feedbackService.listFeedbacks()));
		return new ModelAndView("FeedbackListing", model);
	}
	
	@RequestMapping(value = "/editfeedback", method = RequestMethod.GET)
	public ModelAndView deleteFeedback(@ModelAttribute("feedback") FeedbackBean feedbackBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("feedback", prepareFeedbackBean(feedbackService.getFeedback(feedbackBean.getFeedbackId())));
		model.put("feedbacks",  prepareListofBean(feedbackService.listFeedbacks()));
		return new ModelAndView("FeedbackAdd", model);//jsp
	}
	
	private FeedbackBean prepareFeedbackBean(Feedback feedback){
		FeedbackBean bean = new FeedbackBean();
		
		bean.setFeedbackId(feedback.getFeedbackId());
		bean.setDescriptionF(feedback.getDescriptionF());
		bean.setFeedbackRate(feedback.getFeedbackRate());
		bean.setFeedbackEmail(feedback.getFeedbackEmail());
		
	
		return bean;
	}
	
	
	private Feedback prepareModel(FeedbackBean feedbackBean){
		Feedback feedback = new Feedback();
		//if(feedbackBean.getFeedbackId()!=0)
		//{
			feedback.setFeedbackId(feedbackBean.getFeedbackId());
		//}
		feedback.setDescriptionF(feedbackBean.getDescriptionF());
		feedback.setFeedbackRate(feedbackBean.getFeedbackRate());
		feedback.setFeedbackEmail(feedbackBean.getFeedbackEmail());
		feedbackBean.setFeedbackId(null);
		//departmentBean.setDeptId(null);
		return feedback;
	}
	
	private List<FeedbackBean> prepareListofBean(List<Feedback> feedbacks){
		List<FeedbackBean> beans = null;
		if(feedbacks != null && !feedbacks.isEmpty()){
			beans = new ArrayList<FeedbackBean>();
			FeedbackBean bean = null;
			for(Feedback feedback : feedbacks){
				bean = new FeedbackBean();
				bean.setFeedbackId(feedback.getFeedbackId());
				bean.setDescriptionF(feedback.getDescriptionF());
				bean.setFeedbackRate(feedback.getFeedbackRate());
				bean.setFeedbackEmail(feedback.getFeedbackEmail());
				
				beans.add(bean);
			}
		}
		return beans;
	}

}
