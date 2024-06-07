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

import com.admin.bean.CustomerBean;
import com.admin.model.Customer;
import com.admin.service.CustomerService;

@Controller
public class CustomerController {
		
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ModelAndView saveCustomer(@ModelAttribute("customerBean") CustomerBean customerBean, 
			BindingResult result) {
		Customer customer = prepareModel(customerBean);
		customerService.addCustomer(customer);
		return new ModelAndView("redirect:/addcustomer");
	}

	@RequestMapping(value="/customer", method = RequestMethod.GET)
	public ModelAndView listCustomers() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("customers",  prepareListofBean(customerService.listCustomers()));
		return new ModelAndView("customer_listing", model);
	}

	@RequestMapping(value = "/addcustomer", method = RequestMethod.GET)
	public ModelAndView addCustomer(@ModelAttribute("customerBean")  CustomerBean customerBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("customers",  prepareListofBean(customerService.listCustomers()));
		return new ModelAndView("addcustomer", model);
	}
	
	@RequestMapping(value = "/deletecustomer", method = RequestMethod.GET)
	public ModelAndView deleteCustomer(@ModelAttribute("customerBean")  CustomerBean customerBean,
			BindingResult result) {
		customerService.deleteCustomer(prepareModel(customerBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("customer", null);
		model.put("customers",  prepareListofBean(customerService.listCustomers()));
		return new ModelAndView("addcustomer", model);
	}
	
	@RequestMapping(value = "/editcustomer", method = RequestMethod.GET)
	public ModelAndView editCustomer(@ModelAttribute("customerBean")  CustomerBean customerBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("customer", prepareCustomerBean(customerService.getCustomer(customerBean.getC_id())));
		model.put("customers",  prepareListofBean(customerService.listCustomers()));
		return new ModelAndView("addcustomer", model);
	}
	
	private Customer prepareModel(CustomerBean customerBean){
		Customer customer = new Customer();
		if(null != customerBean.getC_id() && customerBean.getC_id() > 0){
			customer.setC_id(customerBean.getC_id());
		}
		customer.setC_id(customerBean.getC_id());
		customer.setC_name(customerBean.getC_name());
		customer.setC_address(customerBean.getC_address());
		customer.setC_contact(customerBean.getC_contact());
		customer.setC_email(customerBean.getC_email());
		customerBean.setC_id(null);
		return customer;
	}
	
	private List<CustomerBean> prepareListofBean(List<Customer> customers){
		List<CustomerBean> beans = null;
		if(customers != null && !customers.isEmpty()){
			beans = new ArrayList<CustomerBean>();
			CustomerBean bean = null;
			for(Customer customer : customers){
				bean = new CustomerBean();
				bean.setC_id(customer.getC_id());
				bean.setC_name(customer.getC_name());
				bean.setC_address(customer.getC_address());
				bean.setC_contact(customer.getC_contact());
				bean.setC_email(customer.getC_email());
				beans.add(bean);
			}
		}
		return beans;
	}
	
	private CustomerBean prepareCustomerBean(Customer customer){
		CustomerBean bean = new CustomerBean();
		bean.setC_id(customer.getC_id());
		bean.setC_name(customer.getC_name());
		bean.setC_address(customer.getC_address());
		bean.setC_contact(customer.getC_contact());
		bean.setC_email(customer.getC_email());
		return bean;
	}
	
}
