package com.admin.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
import com.admin.bean.FeeBean;
import com.admin.bean.UserMasterBean;
import com.admin.model.Course;
import com.admin.model.Fee;
import com.admin.model.UserMaster;
import com.admin.service.FeeService;

@Controller
public class FeeController {
	@Autowired
	private FeeService feeService;
	
	@RequestMapping(value = "/savefee", method = RequestMethod.POST)
	public ModelAndView saveFee(@ModelAttribute("fee") FeeBean feeBean, 
			BindingResult result) {
	 Fee fee = prepareModel(feeBean);
		feeService.addFee(fee);
		return new ModelAndView("redirect:/addfee");
	}
	
	/*
	 * @RequestMapping(value = "/addfee", method = RequestMethod.GET) public
	 * ModelAndView addFee(@ModelAttribute("fee") FeeBean feeBean, BindingResult
	 * result) { Map<String, Object> model = new HashMap<String, Object>();
	 * model.put("fees", prepareListofBean(feeService.listFees()));
	 * model.put("courses", prepareListofBeanForCourse(feeService.listCourses()));
	 * model.put("students",
	 * prepareListofBeanForStudent(feeService.listUserMasters())); return new
	 * ModelAndView("feeAdd",model); }
	 */
	
	
	/*
	 * SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy"); Date d=new
	 * Date();
	 */private Fee prepareModel(FeeBean feeBean){
		Fee fee = new Fee();
		fee.setPayment_Id(feeBean.getPayment_Id());
		fee.setPayment_Date(feeBean.getPayment_Date());
		fee.setFee_Amount(feeBean.getFee_Amount());
		fee.setUsermaster_Id(feeBean.getUser_master_Id());
		fee.setCourse_Name(feeBean.getCourse_Name());
		fee.setPayment_Id(null);
		return fee;
	}
	
	@RequestMapping(value="/fees", method = RequestMethod.GET)
	public ModelAndView listFees() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("fees",  prepareListofBean(feeService.listFees()));
		model.put("courses",  prepareListofBeanForCourse(feeService.listCourses()));
		model.put("students",  prepareListofBeanForStudent(feeService.listUserMasters(),3));
		return new ModelAndView("fee_listing", model);
	}
	
	private List<FeeBean> prepareListofBean(List<Fee> fees){
		List<FeeBean> beans = null;
		if(fees != null && !fees.isEmpty()){
			beans = new ArrayList<FeeBean>();
			FeeBean bean = null;
			for(Fee fee : fees){
				bean = new FeeBean();
				bean.setPayment_Id(fee.getPayment_Id());
				bean.setPayment_Date(fee.getPayment_Date());
				bean.setFee_Amount(fee.getFee_Amount());
				bean.setUser_master_Id(fee.getUsermaster_Id());
				bean.setOrder_Id(fee.getOrder_Id());
				bean.setCourse_Name(fee.getCourse_Name());
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
