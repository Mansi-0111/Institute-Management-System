package com.admin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.admin.bean.AppConstant;
import com.admin.bean.CourseBean;
import com.admin.bean.LoggerInfo;
import com.admin.bean.LoginBean;
import com.admin.bean.UserMasterBean;
import com.admin.bean.UserTypeBean;
import com.admin.dao.DashboardDao;
import com.admin.dao.SendMail;
import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;
import com.admin.service.DashboardService;
import com.admin.service.StaffService;

@Controller
public class StaffRegistrationController {
	
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value = "/savestaff", method = RequestMethod.POST)
	public ModelAndView saveStaff(@ModelAttribute("staffregistration") UserMasterBean userMasterBean, 
			BindingResult result) {
	 UserMaster userMaster = prepareModel(userMasterBean);
		staffService.addStaff(userMaster);
		
		String body="Your Username : "+userMaster.getUser_Email()+", Your password is : "+userMaster.getUser_Password();
		
		SendMail.send(AppConstant.fromEmail, AppConstant.fromPaassword, userMaster.getUser_Email(), "Registered successfully", body);
		
		return new ModelAndView("redirect:/addstaff");
	}
	
	/*
	 * @RequestMapping(value = "/addstaff", method = RequestMethod.GET) public
	 * ModelAndView addStaff(@ModelAttribute("staffregistration") UserMasterBean
	 * userMasterBean, BindingResult result) { Map<String, Object> model = new
	 * HashMap<String, Object>(); model.put("userTypes",
	 * prepareListofBeanForUser(staffService.listUserTypes())); model.put("courses",
	 * prepareListofBeanForCourse(staffService.listCourses()));
	 * model.put("staffregistrations",
	 * prepareListofBean(staffService.listStaffRegistrations(),2)); return new
	 * ModelAndView("staffAdd",model); }
	 */
	
	private UserMaster prepareModel( UserMasterBean userMasterBean){
		UserMaster userMaster = new UserMaster();
		
		userMaster.setUser_master_Id(userMasterBean.getUser_master_Id());
		userMaster.setUser_Fname(userMasterBean.getUser_Fname());
		userMaster.setUser_Lname(userMasterBean.getUser_Lname());
		userMaster.setUser_Address(userMasterBean.getUser_Address());
		userMaster.setUser_Gender(userMasterBean.getUser_Gender());
		userMaster.setUser_Dob(userMasterBean.getUser_Dob());
		userMaster.setUser_Email(userMasterBean.getUser_Email());
		userMaster.setUser_Contact(userMasterBean.getUser_Contact());
		userMaster.setUser_Qualification(userMasterBean.getUser_Qualification());
		userMaster.setUser_Password(userMasterBean.getUser_Password());
		userMaster.setUser_type_Id(2);
		userMaster.setCourse_Id(userMasterBean.getCourse_Id());

		userMasterBean.setUser_master_Id(null);
		return userMaster;
	}
	
	@RequestMapping(value="/staffregistrations", method = RequestMethod.GET)
	public ModelAndView listStaffs() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("userTypes", prepareListofBeanForUser(staffService.listUserTypes()));
		model.put("courses",  prepareListofBeanForCourse(staffService.listCourses()));
		model.put("staffregistrations",  prepareListofBean(staffService.listStaffRegistrations(),2));
		return new ModelAndView("staff_listing", model);
	}
	
	@RequestMapping(value = "/indexstaff", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("indexstaff");
	}
	
	@RequestMapping(value = "/deletestaff", method = RequestMethod.GET)
	public ModelAndView editStaff(@ModelAttribute("staffregistration")  UserMasterBean userMasterBean,
			BindingResult result) {
		staffService.deletStaff(prepareModel(userMasterBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("staffregistration", null);
		model.put("staffregistrations",  prepareListofBean(staffService.listStaffRegistrations(),2));
		return new ModelAndView("redirect:/addstaff", model);
	}
	
	@RequestMapping(value = "/editstaff", method = RequestMethod.GET)
	public ModelAndView deleteStaff(@ModelAttribute("staffregistration") UserMasterBean userMasterBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("staffregistration", prepareStaffBean(staffService.getStaffRegistration(userMasterBean.getUser_master_Id())));
		model.put("staffregistrations",  prepareListofBean(staffService.listStaffRegistrations(),2));
		return new ModelAndView("staffAdd", model);
	}
	
	private List<UserMasterBean> prepareListofBean(List<UserMaster> staffRegistrations,int User_type_Id){
		List<UserMasterBean> beans = null;
		if(staffRegistrations != null && !staffRegistrations.isEmpty()){
			beans = new ArrayList<UserMasterBean>();
			UserMasterBean bean = null;
			for(UserMaster userMaster : staffRegistrations){
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
				bean.setUser_Qualification(userMaster.getUser_Qualification());
				bean.setUser_Password(userMaster.getUser_Password());
				bean.setUser_type_Id(userMaster.getUser_type_Id());
				bean.setCourse_Id(userMaster.getCourse_Id());
				beans.add(bean);
			}
				
			}
		}
		return beans;
	}
	
	private UserMasterBean prepareStaffBean(UserMaster userMaster){
		UserMasterBean bean = new UserMasterBean();

		bean.setUser_master_Id(userMaster.getUser_master_Id());
		bean.setUser_Fname(userMaster.getUser_Fname());
		bean.setUser_Lname(userMaster.getUser_Lname());
		bean.setUser_Address(userMaster.getUser_Address());
		bean.setUser_Gender(userMaster.getUser_Gender());
		bean.setUser_Dob(userMaster.getUser_Dob());
		bean.setUser_Email(userMaster.getUser_Email());
		bean.setUser_Contact(userMaster.getUser_Contact());
		bean.setUser_Qualification(userMaster.getUser_Qualification());
		bean.setUser_Password(userMaster.getUser_Password());
		return bean;
	}
	
	private List<UserTypeBean> prepareListofBeanForUser(List<UserType> userTypes){
		List<UserTypeBean> beans = null;
		if(userTypes != null && !userTypes.isEmpty()){
			beans = new ArrayList<UserTypeBean>();
			UserTypeBean bean = null;
			for(UserType userType : userTypes){
				bean = new UserTypeBean();
				
				bean.setUser_type_Id(userType.getUser_type_Id());
				bean.setUser_type_Name(userType.getUser_type_Name());
				beans.add(bean);
			}
		}
		return beans;
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

	@Autowired
	DashboardService dashboardService;

	
	@RequestMapping("/checklogin")
	public ModelAndView checklogin(@ModelAttribute("loginBean")  LoginBean loginBean,
			BindingResult result, HttpSession httpSession) {
		Map<String, Object> model1 = new HashMap<String, Object>();

		LoggerInfo loggerInfo = staffService.getLoggerInfo(loginBean);
		httpSession.setAttribute("loggerInfo", loggerInfo);
		
		int userCnt = dashboardService.userCount();

		model1.put("userCount", userCnt);
		model1.put("staffCount", dashboardService.staffCount());
		model1.put("studentCount", dashboardService.studentCount());
		model1.put("facultyCount", dashboardService.facultyCount());
		model1.put("feedbackCount", dashboardService.feedbackCount());
		model1.put("inquiryCount", dashboardService.inquiryCount());
		
		
		return new ModelAndView("Dashboard",model1);
	}	
	 
	 
	
	
}
