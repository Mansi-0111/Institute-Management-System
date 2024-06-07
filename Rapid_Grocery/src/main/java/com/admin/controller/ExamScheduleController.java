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

import com.admin.bean.AppConstant;
import com.admin.bean.CourseBean;
import com.admin.bean.ExamScheduleBean;
import com.admin.bean.UserMasterBean;
import com.admin.dao.SendMail;
import com.admin.model.Course;
import com.admin.model.ExamSchedule;
import com.admin.model.UserMaster;
import com.admin.service.ExamScheduleService;
import com.admin.service.StudentRegistrationService;

@Controller
public class ExamScheduleController {

	@Autowired
	private ExamScheduleService examScheduleService;
	
	@Autowired
	private StudentRegistrationService studentRegistrationService;

	
	
	@RequestMapping(value = "/saveexamschedule", method = RequestMethod.POST)
	public ModelAndView saveExamSchedule(@ModelAttribute("examschedule") ExamScheduleBean examScheduleBean, 
			BindingResult result) {
		ExamSchedule examSchedule = prepareModel(examScheduleBean);
		examScheduleService.addExamSchedule(examSchedule);
		
		
		List<UserMasterBean> list = prepareListofBean(studentRegistrationService.listStudentRegistrations(),3);
		if(null != list && !list.isEmpty()) {
			String body="Dear Student your exam scheduled on "+examSchedule.getExamschedule_Date()+" so please check on website and attempt.";
			for(int i=0;i<list.size();i++) {
				
				SendMail.send(AppConstant.fromEmail, AppConstant.fromPaassword, list.get(i).getUser_Email(), "Online-Exam", body);
			}
		}
		
		return new ModelAndView("redirect:/addexamschedule");
	}
	
	private List<UserMasterBean> prepareListofBean(List<UserMaster> studentRegistrations,int User_type_Id){
		List<UserMasterBean> beans = null;
		if(studentRegistrations != null && !studentRegistrations.isEmpty()){
			beans = new ArrayList<UserMasterBean>();
			UserMasterBean bean = null;
			for(UserMaster userMaster : studentRegistrations){
				
					if(null !=userMaster.getUser_type_Id()&& User_type_Id==userMaster.getUser_type_Id()) {
					bean = new UserMasterBean();
					
					bean.setUser_master_Id(userMaster.getUser_master_Id());
					bean.setUser_Fname(userMaster.getUser_Fname());
					bean.setUser_Lname(userMaster.getUser_Lname());
					bean.setUser_Address(userMaster.getUser_Address());
					bean.setUser_Gender(userMaster.getUser_Gender());
					bean.setUser_Dob(userMaster.getUser_Dob());
					bean.setUser_Email(userMaster.getUser_Email());
					bean.setUser_Contact(userMaster.getUser_Contact());
					bean.setUser_Addmissiondate(userMaster.getUser_Addmissiondate());
					bean.setUser_Password(userMaster.getUser_Password());
					bean.setUser_Parentfname(userMaster.getUser_Parentfname());
					bean.setUser_ParentContact(userMaster.getUser_ParentContact());
					bean.setUser_Parentemail(userMaster.getUser_Parentemail());	
					bean.setUser_type_Id(userMaster.getUser_type_Id());
					bean.setCourse_Id(userMaster.getCourse_Id());
					beans.add(bean);	
					
				}
			}
			}
		
		return beans;
	}

	@RequestMapping(value="/examschedules", method = RequestMethod.GET)
	public ModelAndView listExamSchedules() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("courses",  prepareListofBeanForCourse(examScheduleService.listCourses()));
		model.put("faculty",  prepareListofBeanForFaculty(examScheduleService.listUserMasters(),4));
		model.put("examschedules",  prepareListofBean(examScheduleService.listExamSchedules()));
		return new ModelAndView("examschedule_listing", model);
	}

	/*
	 * @RequestMapping(value = "/addexamschedule", method = RequestMethod.GET)
	 * public ModelAndView addExamSchedule(@ModelAttribute("examschedule")
	 * ExamScheduleBean examScheduleBean, BindingResult result) { Map<String,
	 * Object> model = new HashMap<String, Object>(); model.put("courses",
	 * prepareListofBeanForCourse(examScheduleService.listCourses()));
	 * model.put("faculty",
	 * prepareListofBeanForFaculty(examScheduleService.listUserMasters()));
	 * model.put("examschedules",
	 * prepareListofBean(examScheduleService.listExamSchedules())); return new
	 * ModelAndView("ExamScheduleAdd", model); }
	 */
	
	@RequestMapping(value = "/indexexamschedule", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("indexexamschedule");
	}
	
	@RequestMapping(value = "/deleteexamschedule", method = RequestMethod.GET)
	public ModelAndView editExamSchedule(@ModelAttribute("examschedule")  ExamScheduleBean examScheduleBean,
			BindingResult result) {
		examScheduleService.deleteExamSchedule(prepareModel(examScheduleBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("examschedule", null);
		model.put("examschedules",  prepareListofBean(examScheduleService.listExamSchedules()));
		return new ModelAndView("redirect:/addexamschedule");
	}
	
	@RequestMapping(value = "/editexamschedule", method = RequestMethod.GET)
	public ModelAndView deleteExamSchedule(@ModelAttribute("examschedule")  ExamScheduleBean examScheduleBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("examschedule", prepareExamScheduleBean(examScheduleService.getExamSchedule(examScheduleBean.getExamschedule_Id())));
		model.put("examschedules",  prepareListofBean(examScheduleService.listExamSchedules()));
		return new ModelAndView("ExamScheduleAdd", model);
	}
	
	private ExamSchedule prepareModel(ExamScheduleBean examScheduleBean){
		ExamSchedule examSchedule = new ExamSchedule();
		
		examSchedule.setExamschedule_Id(examScheduleBean.getExamschedule_Id());
		examSchedule.setExamschedule_Date(examScheduleBean.getExamschedule_Date());
		examSchedule.setCourse_Id(examScheduleBean.getCourse_Id());
		examSchedule.setUser_master_Id(examScheduleBean.getUser_master_Id());
		examScheduleBean.setExamschedule_Id(null);
		return examSchedule;
	}
	
	private List<ExamScheduleBean> prepareListofBean(List<ExamSchedule> examSchedules){
		List<ExamScheduleBean> beans = null;
		if(examSchedules != null && !examSchedules.isEmpty()){
			beans = new ArrayList<ExamScheduleBean>();
			ExamScheduleBean bean = null;
			for(ExamSchedule examSchedule : examSchedules){
				bean = new ExamScheduleBean();
				bean.setExamschedule_Id(examSchedule.getExamschedule_Id());
				bean.setExamschedule_Date(examSchedule.getExamschedule_Date());
				bean.setCourse_Id(examSchedule.getCourse_Id());
				bean.setUser_master_Id(examSchedule.getUser_master_Id());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private ExamScheduleBean prepareExamScheduleBean(ExamSchedule examSchedule){
		ExamScheduleBean bean = new ExamScheduleBean();
		bean.setExamschedule_Id(examSchedule.getExamschedule_Id());
		bean.setExamschedule_Date(examSchedule.getExamschedule_Date());
		return bean;
	}

	
	private List<CourseBean> prepareListofBeanForCourse(List<Course> courses){
		List<CourseBean> beans = null;
		if(courses != null && !courses.isEmpty()){
			beans = new ArrayList<CourseBean>();
			CourseBean bean = null;
			for(Course course : courses){
				bean = new CourseBean();
				
				bean.setCourse_Id(course.getCourse_Id());
				bean.setCourse_Name(course.getCourse_Name());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	
	private List<UserMasterBean> prepareListofBeanForFaculty(List<UserMaster> studentRegistrations ,int User_type_Id){
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
