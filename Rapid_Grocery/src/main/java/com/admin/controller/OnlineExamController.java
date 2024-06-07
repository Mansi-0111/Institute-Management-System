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

import com.admin.bean.CourseBean;
import com.admin.bean.OnlineExamBean;
import com.admin.bean.UserMasterBean;
import com.admin.model.Course;
import com.admin.model.OnlineExam;
import com.admin.model.UserMaster;
import com.admin.service.OnlineExamService;

@Controller
public class OnlineExamController {

	@Autowired
	private OnlineExamService onlineExamService;
	
	@RequestMapping(value = "/saveonlineexam", method = RequestMethod.POST)
	public ModelAndView saveOnlineExam(@ModelAttribute("onlineexam") OnlineExamBean onlineExamBean, 
			BindingResult result) {
	 OnlineExam onlineExam = prepareModel(onlineExamBean);
		onlineExamService.addOnlineExam(onlineExam);
		return new ModelAndView("redirect:/addonlineexam");
	}
	
	
	/*
	 * @RequestMapping(value = "/addonlineexam", method = RequestMethod.GET) public
	 * ModelAndView addOnlineExam(@ModelAttribute("onlineexam") OnlineExamBean
	 * onlineExamBean, BindingResult result) { Map<String, Object> model = new
	 * HashMap<String, Object>(); model.put("onlineexams",
	 * prepareListofBean(onlineExamService.listOnlineExams())); model.put("courses",
	 * prepareListofBeanForCourse(onlineExamService.listCourses()));
	 * model.put("students",
	 * prepareListofBeanForStudent(onlineExamService.listUserMasters())); return new
	 * ModelAndView("OnlineExamAdd",model); }
	 */
	 
	private OnlineExam prepareModel(OnlineExamBean onlineExamBean){
		OnlineExam onlineExam = new OnlineExam();
		
		onlineExam.setOnlineexam_Id(onlineExamBean.getOnlineexam_Id());
		onlineExam.setTotal_Marks(onlineExamBean.getTotal_Marks());
		onlineExam.setObtain_Marks(onlineExamBean.getObtain_Marks());
		onlineExam.setExam_Date(onlineExamBean.getExam_Date());
		onlineExam.setCourse_Id(onlineExamBean.getCourse_Id());
		onlineExam.setUser_master_Id(onlineExamBean.getUser_master_Id());
		onlineExamBean.setOnlineexam_Id(null);
		return onlineExam;
	}
	
	@RequestMapping(value="/onlineexams", method = RequestMethod.GET)
	public ModelAndView listSalaries() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("onlineexams",  prepareListofBean(onlineExamService.listOnlineExams()));
		model.put("courses",  prepareListofBeanForCourse(onlineExamService.listCourses()));
		model.put("students",  prepareListofBeanForStudent(onlineExamService.listUserMasters(),3));
		return new ModelAndView("onlineexam_listing", model);
	}
	
	private List<OnlineExamBean> prepareListofBean(List<OnlineExam> onlineExams){
		List<OnlineExamBean> beans = null;
		if(onlineExams != null && !onlineExams.isEmpty()){
			beans = new ArrayList<OnlineExamBean>();
			OnlineExamBean bean = null;
			for(OnlineExam onlineExam : onlineExams){
				bean = new OnlineExamBean();
				
				bean.setOnlineexam_Id(onlineExam.getOnlineexam_Id());
				bean.setTotal_Marks(onlineExam.getTotal_Marks());
				bean.setObtain_Marks(onlineExam.getObtain_Marks());
				bean.setExam_Date(onlineExam.getExam_Date());
				bean.setCourse_Id(onlineExam.getCourse_Id());
				bean.setUser_master_Id(onlineExam.getUser_master_Id());
		
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
