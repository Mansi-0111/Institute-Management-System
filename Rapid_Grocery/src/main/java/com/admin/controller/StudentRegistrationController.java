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
import com.admin.bean.UserMasterBean;
import com.admin.bean.UserTypeBean;
import com.admin.dao.SendMail;
import com.admin.model.Course;
import com.admin.model.UserMaster;
import com.admin.model.UserType;
import com.admin.service.StudentRegistrationService;

@Controller
public class StudentRegistrationController {

	@Autowired
	private StudentRegistrationService studentRegistrationService;
	
	@RequestMapping(value = "/savestudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute("sturegistration") UserMasterBean userMasterBean, 
			BindingResult result) {
		UserMaster userMaster = prepareModel(userMasterBean);
		studentRegistrationService.addStudent(userMaster);
		
		String body="Dear student, Your Username : "+userMaster.getUser_Email()+", You password is : "+userMaster.getUser_Password();
		
		SendMail.send(AppConstant.fromEmail, AppConstant.fromPaassword, userMaster.getUser_Email(), "Registered successfully", body);
		
		
		return new ModelAndView("redirect:/addstudent");
	}
	
	/*
	 * @RequestMapping(value = "/addstudent", method = RequestMethod.GET) public
	 * ModelAndView addStudent(@ModelAttribute("sturegistration") UserMasterBean
	 * userMasterBean, BindingResult result) { Map<String, Object> model = new
	 * HashMap<String, Object>(); model.put("userTypes",
	 * prepareListofBeanForUser(studentRegistrationService.listUserTypes()));
	 * model.put("studentregistrations",
	 * prepareListofBean(studentRegistrationService.listStudentRegistrations(),3));
	 * model.put("courses",
	 * prepareListofBeanForCourse(studentRegistrationService.listCourses())); return
	 * new ModelAndView("AddStudents",model); }
	 */
	
	private UserMaster prepareModel(UserMasterBean userMasterBean){
		UserMaster userMaster = new UserMaster();
		
		userMaster.setUser_master_Id(userMasterBean.getUser_master_Id());
		userMaster.setUser_Fname(userMasterBean.getUser_Fname());
		userMaster.setUser_Lname(userMasterBean.getUser_Lname());
		userMaster.setUser_Address(userMasterBean.getUser_Address());
		userMaster.setUser_Gender(userMasterBean.getUser_Gender());
		userMaster.setUser_Dob(userMasterBean.getUser_Dob());
		userMaster.setUser_Email(userMasterBean.getUser_Email());
		userMaster.setUser_Contact(userMasterBean.getUser_Contact());
		userMaster.setUser_Addmissiondate(userMasterBean.getUser_Addmissiondate());
		userMaster.setUser_Password(userMasterBean.getUser_Password());
		userMaster.setUser_Parentfname(userMasterBean.getUser_Parentfname());
		userMaster.setUser_ParentContact(userMasterBean.getUser_ParentContact());
		userMaster.setUser_Parentemail(userMasterBean.getUser_Parentemail());
		userMaster.setCourse_Id(userMasterBean.getCourse_Id());
		userMaster.setUser_type_Id(3);;
		userMasterBean.setUser_master_Id(null);
		return userMaster;
	}
	
	
	
	@RequestMapping(value="/studentregistrations", method = RequestMethod.GET)
	public ModelAndView listStudents() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("userTypes",  prepareListofBeanForUser(studentRegistrationService.listUserTypes()));
		model.put("studentregistrations",  prepareListofBean(studentRegistrationService.listStudentRegistrations(),3));
		model.put("courses",  prepareListofBeanForCourse(studentRegistrationService.listCourses()));
		return new ModelAndView("student_listing", model);
	}
	
	@RequestMapping(value = "/indexstudent", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("indexstudent");
	}
	
	@RequestMapping(value = "/deletestudent", method = RequestMethod.GET)
	public ModelAndView editStudent(@ModelAttribute("sturegistration") UserMasterBean userMasterBean,
			BindingResult result) {
		studentRegistrationService.deletStudent(prepareModel(userMasterBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("studentregistration", null);
		model.put("studentregistrations",  prepareListofBean(studentRegistrationService.listStudentRegistrations(),3));
		return new ModelAndView("student_listing", model);
	}
	
	@RequestMapping(value = "/editstudent", method = RequestMethod.GET)
	public ModelAndView deletStudent(@ModelAttribute("sturegistration") UserMasterBean userMasterBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("studentregistration", prepareStudentBean(studentRegistrationService.getStudentRegistration(userMasterBean.getUser_master_Id())));
		model.put("studentregistrations",  prepareListofBean(studentRegistrationService.listStudentRegistrations(),3));
		model.put("courses",  prepareListofBeanForCourse(studentRegistrationService.listCourses()));
		return new ModelAndView("AddStudents", model);
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

	private UserMasterBean prepareStudentBean(UserMaster userMaster){
		UserMasterBean bean = new UserMasterBean();
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

	
	
}
