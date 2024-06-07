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

import com.admin.bean.InquiryBean;
import com.admin.model.Inquiry;
import com.admin.service.InquiryService;

@Controller
public class InquiryController {
	@Autowired
	private InquiryService inquiryService;
	
	@RequestMapping(value = "/saveinquiry", method = RequestMethod.POST)
	public ModelAndView saveInquiry(@ModelAttribute("inquiry") InquiryBean inquiryBean, 
			BindingResult result) {
		Inquiry inquiry= prepareModel(inquiryBean);
		inquiryService.addInquiry(inquiry);
		return new ModelAndView("redirect:/addinquiry");//redirect hoi to method nu name
	}
	
	@RequestMapping(value = "/addinquiry", method = RequestMethod.GET)
	public ModelAndView addInquiryt(@ModelAttribute("inquiry") InquiryBean inquiryBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("inquirys",  prepareListofBean(inquiryService.listInquirys()));
		return new ModelAndView("InquiryAdd",model);//redirect no hoi to jsp page
	}
	
	@RequestMapping(value="/inquirys", method = RequestMethod.GET)
	public ModelAndView listInquirys() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("inquirys",  prepareListofBean(inquiryService.listInquirys()));
		return new ModelAndView("InquiryListing", model);
	}
	
	@RequestMapping(value = "/deleteinquiry", method = RequestMethod.GET)
	public ModelAndView editInquiry(@ModelAttribute("inquiry")  InquiryBean inquiryBean,
			BindingResult result) {
		inquiryService.deleteInquiry(prepareModel(inquiryBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("inquiry", null);
		model.put("inquirys",  prepareListofBean(inquiryService.listInquirys()));
		return new ModelAndView("redirect:/addinquiry", model);
	}
	
	
	private InquiryBean prepareInquiryBean(Inquiry inquiry){
		InquiryBean bean = new InquiryBean();
		bean.setInquiryId(inquiry.getInquiryId());
		bean.setInquiryName(inquiry.getInquiryName());
		bean.setInquiryAdd(inquiry.getInquiryAdd());
		bean.setInquiryQuery(inquiry.getInquiryQuery());
		bean.setInquiryMail(inquiry.getInquiryMail());
		
		
		return bean;
	}
	
	
	private Inquiry prepareModel(InquiryBean inquiryBean){
		Inquiry inquiry = new Inquiry();
		//if(inquiryBean.getInquiryId()!=0)
		//{
			inquiry.setInquiryId(inquiryBean.getInquiryId());
		//}
		inquiry.setInquiryName(inquiryBean.getInquiryName());		
		inquiry.setInquiryAdd(inquiryBean.getInquiryAdd());
		inquiry.setInquiryQuery(inquiryBean.getInquiryQuery());
		inquiry.setInquiryMail(inquiryBean.getInquiryMail());
		
		//departmentBean.setDeptId(null);
		return inquiry;
	}
	
	private List<InquiryBean> prepareListofBean(List<Inquiry> inquirys){
		List<InquiryBean> beans = null;
		if(inquirys != null && !inquirys.isEmpty()){
			beans = new ArrayList<InquiryBean>();
			InquiryBean bean = null;
			for(Inquiry inquiry : inquirys){
				bean = new InquiryBean();
				bean.setInquiryId(inquiry.getInquiryId());
				bean.setInquiryName(inquiry.getInquiryName());
				bean.setInquiryAdd(inquiry.getInquiryAdd());
				bean.setInquiryQuery(inquiry.getInquiryQuery());
				bean.setInquiryMail(inquiry.getInquiryMail());
				beans.add(bean);
			}
		}
		return beans;
	}
}
