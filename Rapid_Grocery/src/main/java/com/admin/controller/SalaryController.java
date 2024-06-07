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

import com.admin.bean.SalaryBean;
import com.admin.bean.UserMasterBean;
import com.admin.model.Salary;
import com.admin.model.UserMaster;
import com.admin.service.SalaryService;

@Controller
public class SalaryController {

	@Autowired
	private SalaryService salaryService;
	
	@RequestMapping(value = "/savesalary", method = RequestMethod.POST)
	public ModelAndView saveSalary(@ModelAttribute("salary") SalaryBean salaryBean, 
			BindingResult result) {
	 Salary salary = prepareModel(salaryBean);
		salaryService.addSalary(salary);
		return new ModelAndView("redirect:/addsalary");
	}
	
	/*
	 * @RequestMapping(value = "/addsalary", method = RequestMethod.GET) public
	 * ModelAndView addSalary(@ModelAttribute("salary") SalaryBean salaryBean,
	 * BindingResult result) { Map<String, Object> model = new HashMap<String,
	 * Object>(); model.put("salarys",
	 * prepareListofBean(salaryService.listSalaries())); model.put("users",
	 * prepareListofBeanForusers(salaryService.listUserMasters())); return new
	 * ModelAndView("salaryAdd",model); }
	 */
	
	private Salary prepareModel(SalaryBean salaryBean){
		Salary salary = new Salary();
		
		salary.setSalary_Id(salaryBean.getSalary_Id());
		salary.setSalary_Amount(salaryBean.getSalary_Amount());
		salary.setSalary_Date(salaryBean.getSalary_Date());
		salaryBean.setSalary_Id(null);
		return salary;
	}
	
	@RequestMapping(value="/salarys", method = RequestMethod.GET)
	public ModelAndView listSalaries() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("salarys",  prepareListofBean(salaryService.listSalaries()));
		model.put("users",  prepareListofBeanForusers(salaryService.listUserMasters(),2,4));
		return new ModelAndView("salary_listing", model);
	}
	
	private List<SalaryBean> prepareListofBean(List<Salary> salarys){
		List<SalaryBean> beans = null;
		if(salarys != null && !salarys.isEmpty()){
			beans = new ArrayList<SalaryBean>();
			SalaryBean bean = null;
			for(Salary salary : salarys){
				bean = new SalaryBean();
				bean.setSalary_Id(salary.getSalary_Id());
				bean.setSalary_Amount(salary.getSalary_Amount());
				bean.setSalary_Date(salary.getSalary_Date());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	
	private List<UserMasterBean> prepareListofBeanForusers(List<UserMaster> studentRegistrations,int User_type_Id,int User_type_ID){
		List<UserMasterBean> beans = null;
		if(studentRegistrations != null && !studentRegistrations.isEmpty()){
			beans = new ArrayList<UserMasterBean>();
			UserMasterBean bean = null;
			for(UserMaster userMaster : studentRegistrations){
				if(null !=userMaster.getUser_type_Id()&& User_type_Id==userMaster.getUser_type_Id()||User_type_ID==userMaster.getUser_type_Id()) {

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
