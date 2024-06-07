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
import com.admin.bean.ExamqaBean;
import com.admin.bean.MeetingreqBean;
import com.admin.bean.UserMasterBean;
import com.admin.dao.SendMail;
import com.admin.model.Course;
import com.admin.model.Exam_QA;
import com.admin.model.Meeting_request;
import com.admin.model.UserMaster;
import com.admin.service.ExamqaService;
import com.admin.service.MeetingreqService;
import com.admin.service.StudentRegistrationService;

@Controller
public class MeetingreqController {
	
	@Autowired
	private MeetingreqService meetingreqService;
	
	@Autowired
	private StudentRegistrationService studentRegistrationService;

	
	
	  @RequestMapping(value = "/savemeetingreq", method = RequestMethod.POST)
	  public ModelAndView saveMeetingreq(@ModelAttribute("meetingreq")
		MeetingreqBean meetingreqBean, BindingResult result) {
			Meeting_request meeting_request = prepareModel(meetingreqBean);
			meetingreqService.addMeetingreq(meeting_request);
			
			List<UserMasterBean> list = prepareListofBean(studentRegistrationService.listStudentRegistrations(),3);
			if(null != list && !list.isEmpty()) {
				String body="Parents meeting scheduled on topic "+meeting_request.getTopic() +" on "+meeting_request.getMeeting_Date_time()+" link and time of the meeting provide on website soon please check it";
				for(int i=0;i<list.size();i++) {
					
					SendMail.send(AppConstant.fromEmail, AppConstant.fromPaassword, list.get(i).getUser_Parentemail(), "Parents Meeting", body);
				}
			}
			return new ModelAndView("redirect:/addmeetingreq");
		}//redirect hoi to method nu name

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

	/*
	 * @RequestMapping(value = "/addmeetingreq", method = RequestMethod.GET) public
	 * ModelAndView addMeetingreq(@ModelAttribute("meetingreq")MeetingreqBean
	 * meetingreqBean, BindingResult result) { Map<String, Object> model = new
	 * HashMap<String, Object>(); model.put("meetingreqbeans",
	 * prepareListofBean(meetingreqService.listMeeting_requests())); return new
	 * ModelAndView("Meetingreq",model); }//redirect no hoi to jsp page
	 */	 	 	 
	private Meeting_request prepareModel(MeetingreqBean meetingreqBean){
		Meeting_request meeting_request = new Meeting_request();
		if(null != meetingreqBean.getMeeting_Req_id())
		{
			meeting_request.setMeeting_Req_id(meetingreqBean.getMeeting_Req_id());
		}
		meeting_request.setMeeting_Link(meetingreqBean.getMeeting_Link());
		meeting_request.setMeeting_Date_time(meetingreqBean.getMeeting_Date_time());
		meeting_request.setCourse_ID(meetingreqBean.getCourse_ID());
		meeting_request.setTopic(meetingreqBean.getTopic());
		
		//departmentBean.setDeptId(null);
		return meeting_request;
	}
	
	@RequestMapping(value="/meetingreqs", method = RequestMethod.GET)
	public ModelAndView listMeeting_requests() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("meetingreqs",  prepareListofBean(meetingreqService.listMeeting_requests()));
		model.put("courses", prepareListofBeanForCourse(meetingreqService.listCourses()));
		return new ModelAndView("MeetingreqListing", model);
	}
	
	@RequestMapping(value = "/deletemeetingreq", method = RequestMethod.GET)
	public ModelAndView editMeetingreq(@ModelAttribute("meetingreq") MeetingreqBean meetingreqBean ,
			BindingResult result) {
		meetingreqService.deleteMeeting_request(prepareModel(meetingreqBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("meetingreq", null);
		model.put("meetingreqs",  prepareListofBean(meetingreqService.listMeeting_requests()));
		return new ModelAndView("redirect:/addmeetingreq", model);
	}
	
	@RequestMapping(value = "/editmeetingreq", method = RequestMethod.GET)
	public ModelAndView deleteMeetingreq(@ModelAttribute("meetingreq")  MeetingreqBean meetingreqBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("meetingreq", prepareMeetingreqBean(meetingreqService.getMeeting_request(meetingreqBean.getMeeting_Req_id())));
		model.put("meetingreqs",  prepareListofBean(meetingreqService.listMeeting_requests()));
		return new ModelAndView("MeetingreqAdd", model);//jsp
	}
	
	private MeetingreqBean prepareMeetingreqBean(Meeting_request meeting_request){
		MeetingreqBean meetingreqBean = new MeetingreqBean();
		meetingreqBean.setMeeting_Req_id(meeting_request.getMeeting_Req_id());
		meetingreqBean.setMeeting_Link(meeting_request.getMeeting_Link());
		meetingreqBean.setMeeting_Date_time(meeting_request.getMeeting_Date_time());
		meetingreqBean.setCourse_ID(meeting_request.getCourse_ID());
		meeting_request.setTopic(meetingreqBean.getTopic());
		
		
		return meetingreqBean;
	}
	
	private List<MeetingreqBean> prepareListofBean(List<Meeting_request> meetingreqs){
		List<MeetingreqBean> meetingreqBeans = null;
		if(meetingreqs != null && !meetingreqs.isEmpty()){
			meetingreqBeans = new ArrayList<MeetingreqBean>();
			MeetingreqBean meetingreqBean = null;
			for( Meeting_request meeting_request :meetingreqs){
				meetingreqBean = new MeetingreqBean();
				
				meetingreqBean.setMeeting_Req_id(meeting_request.getMeeting_Req_id());
				meetingreqBean.setMeeting_Link(meeting_request.getMeeting_Link());
				meetingreqBean.setMeeting_Date_time(meeting_request.getMeeting_Date_time());
				meetingreqBean.setCourse_ID(meeting_request.getCourse_ID());
				meetingreqBean.setTopic(meeting_request.getTopic());
				
				meetingreqBeans.add(meetingreqBean);
			}
		}
		return meetingreqBeans;
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
