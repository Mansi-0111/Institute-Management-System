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
import com.admin.service.FacultyService;

@Controller
public class FacultyRegistrationController {

	@Autowired
	private FacultyService facultyService;
	
	@RequestMapping(value = "/savefaculty", method = RequestMethod.POST)
	public ModelAndView saveFaculty(@ModelAttribute("facultyregistration") UserMasterBean userMasterBean, 
			BindingResult result) {
	 UserMaster userMaster = prepareModel(userMasterBean);
		facultyService.addFaculty(userMaster);
		
		String body="Your Username : "+userMaster.getUser_Email()+", You password is : "+userMaster.getUser_Password();
		
		SendMail.send(AppConstant.fromEmail, AppConstant.fromPaassword, userMaster.getUser_Email(), "Registered successfully", body);
		
		return new ModelAndView("redirect:/addfaculty");
	}
	
	/*
	 * @RequestMapping(value = "/addfaculty", method = RequestMethod.GET) public
	 * ModelAndView addFaculty(@ModelAttribute("facultyregistration") UserMasterBean
	 * userMasterBean, BindingResult result) { Map<String, Object> model = new
	 * HashMap<String, Object>(); model.put("userTypes",
	 * prepareListofBeanForUser(facultyService.listUserTypes()));
	 * model.put("courses",
	 * prepareListofBeanForCourse(facultyService.listCourses()));
	 * model.put("facultyregistrations",
	 * prepareListofBean(facultyService.listFacultyRegistrations(),4)); return new
	 * ModelAndView("facultyAdd",model); }
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
		userMaster.setUser_Qualification(userMasterBean.getUser_Qualification());
		userMaster.setUser_Password(userMasterBean.getUser_Password());
		userMaster.setUser_type_Id(4);
		userMasterBean.setUser_master_Id(null);
		return userMaster;
	}
	
	@RequestMapping(value="/facultyregistrations", method = RequestMethod.GET)
	public ModelAndView listFaculties() {
		Map<String, Object> model = new HashMap<String, Object>();
		//model.put("userTypes", prepareListofBeanForUser(facultyService.listUserTypes()));
		model.put("facultyregistrations",  prepareListofBean(facultyService.listFacultyRegistrations(),4));
		return new ModelAndView("faculty_listing", model);
	}
	
	@RequestMapping(value = "/indexfaculty", method = RequestMethod.GET)
	public ModelAndView welcome() {
		return new ModelAndView("indexfaculty");
	}
	
	@RequestMapping(value = "/deletefaculty", method = RequestMethod.GET)
	public ModelAndView editFaculty(@ModelAttribute("facultyregistration") UserMasterBean userMasterBean,
			BindingResult result) {
		facultyService.deletFaculty(prepareModel(userMasterBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("facultyregistration", null);
		model.put("facultyregistrations",  prepareListofBean(facultyService.listFacultyRegistrations(),4));
		return new ModelAndView("redirect:/facultyregistrations");
	}
	
	@RequestMapping(value = "/editfaculty", method = RequestMethod.GET)
	public ModelAndView deleteFaculty(@ModelAttribute("facultyregistration") UserMasterBean userMasterBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("facultyregistration", prepareFacultyBean(facultyService.getFacultyRegistration(userMasterBean.getUser_master_Id())));
		model.put("facultyregistrations",  prepareListofBean(facultyService.listFacultyRegistrations(),4));
		return new ModelAndView("facultyAdd", model);
	}
	
	private List<UserMasterBean> prepareListofBean(List<UserMaster> facultyRegistrations,int User_type_Id){
		List<UserMasterBean> beans = null;
		if(facultyRegistrations != null && !facultyRegistrations.isEmpty()){
			beans = new ArrayList<UserMasterBean>();
			UserMasterBean bean = null;
			for(UserMaster userMaster : facultyRegistrations){
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
				beans.add(bean);
			}
		}
		}
		return beans;
	}
	
	private UserMasterBean prepareFacultyBean(UserMaster userMaster){
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
	
	
	
	  private List<UserTypeBean> prepareListofBeanForUser(List<UserType>
	  userTypes){ List<UserTypeBean> beans = null; if(userTypes != null &&
	  !userTypes.isEmpty()){ beans = new ArrayList<UserTypeBean>(); UserTypeBean
	  bean = null; for(UserType userType : userTypes){ bean = new UserTypeBean();
	  
	  bean.setUser_type_Id(userType.getUser_type_Id());
	  bean.setUser_type_Name(userType.getUser_type_Name()); beans.add(bean); } }
	  return beans; }
	  
	  private List<CourseBean> prepareListofBeanForCourse(List<Course> courses){
	  List<CourseBean> beans = null; if(courses != null && !courses.isEmpty()){
	  beans = new ArrayList<CourseBean>(); CourseBean bean = null; for(Course
	  course : courses){ bean = new CourseBean();
	  
	  bean.setCourse_Id(course.getCourse_Id());
	  bean.setCourse_Name(course.getCourse_Name()); beans.add(bean); } } return
	  beans; }
	  
	 
}
