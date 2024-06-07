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

import com.admin.bean.AssignmentBean;
import com.admin.bean.UserMasterBean;
import com.admin.model.Assignment;
import com.admin.model.UserMaster;
import com.admin.service.AssignmentService;



@Controller
public class AssignmentController {

	@Autowired
	private AssignmentService assignmentService;
	
	@RequestMapping(value = "/saveassignment", method = RequestMethod.POST)
	public ModelAndView saveAssignment(@ModelAttribute("assignment") AssignmentBean assignmentBean, 
			BindingResult result) {
	 Assignment assignment = prepareModel(assignmentBean);
		assignmentService.addAssignment(assignment);
		return new ModelAndView("redirect:/addassignment");
	}
	
	/*
	 * @RequestMapping(value = "/addassignment", method = RequestMethod.GET) public
	 * ModelAndView addAssignment(@ModelAttribute("assignment") AssignmentBean
	 * assignmentBean, BindingResult result) { Map<String, Object> model = new
	 * HashMap<String, Object>(); model.put("assignments",
	 * prepareListofBean(assignmentService.listAssignments(),3));
	 * model.put("students",
	 * prepareListofBeanForStudent(assignmentService.listUserMasters())); return new
	 * ModelAndView("AssignmentAdd",model); }
	 */
	
	private Assignment prepareModel(AssignmentBean assignmentBean){
		Assignment assignment = new Assignment();
		assignment.setAssignment_Id(assignmentBean.getAssignment_Id());
		assignment.setUser_master_Id(assignmentBean.getUser_master_Id());
		assignment.setAssignment_Email(assignmentBean.getAssignment_Email());
		assignment.setAssignment_Submissiondate(assignmentBean.getAssignment_Submissiondate());
		assignment.setAssignment_Pdf(assignmentBean.getAssignment_Pdf());
		assignmentBean.setAssignment_Id(null);
		return assignment;
	}
	
	@RequestMapping(value="/assignments", method = RequestMethod.GET)
	public ModelAndView listAssignments() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("assignments",  prepareListofBean(assignmentService.listAssignments()));
		model.put("students",  prepareListofBeanForStudent(assignmentService.listUserMasters(),3));
		return new ModelAndView("assignment_listing", model);
	}
	
	private List<AssignmentBean> prepareListofBean(List<Assignment> assignments){
		List<AssignmentBean> beans = null;
		if(assignments != null && !assignments.isEmpty()){
			beans = new ArrayList<AssignmentBean>();
			AssignmentBean bean = null;
			for(Assignment assignment : assignments){
				bean = new AssignmentBean();
				bean.setAssignment_Id(assignment.getAssignment_Id());
				bean.setUser_master_Id(assignment.getUser_master_Id());
				bean.setAssignment_Email(assignment.getAssignment_Email());
				bean.setAssignment_Submissiondate(assignment.getAssignment_Submissiondate());
				bean.setAssignment_Pdf(assignment.getAssignment_Pdf());
				beans.add(bean);
			}
		}
		return beans;
	}
	private List<UserMasterBean> prepareListofBeanForStudent(List<UserMaster> studentRegistrations,int User_type_Id){
		List<UserMasterBean> beans = null;
		if(studentRegistrations != null && !studentRegistrations.isEmpty()){
			beans = new ArrayList<UserMasterBean>();
			UserMasterBean bean = null;
			for(UserMaster userMaster : studentRegistrations){
				if(null !=userMaster.getUser_type_Id()&& User_type_Id==userMaster.getUser_type_Id()) {
				bean = new UserMasterBean();
				
				bean.setUser_master_Id(userMaster.getUser_master_Id());
				bean.setUser_Fname(userMaster.getUser_Fname());
				beans.add(bean);
			}
			}
		}
		return beans;
	}

}
