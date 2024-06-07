package com.admin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.admin.bean.CourseBean;
import com.admin.bean.InquiryBean;
import com.admin.bean.LectureScheduleBean;
import com.admin.bean.UserMasterBean;
import com.admin.dao.StudentRegistrationDaoImpl;
import com.admin.model.Course;
import com.admin.model.Inquiry;
import com.admin.model.LectureSchedule;
import com.admin.model.UserMaster;
import com.admin.service.LectureScheduleService;

@Controller
public class LectureScheduleController {

	@Autowired
	private LectureScheduleService lectureScheduleService;
	

	@Autowired
	private StudentRegistrationDaoImpl stc;
	

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	  @RequestMapping(value = "/lectureschedules")
	  public String showlacture(Model m) {
		
		List<Object[]> laclist = new ArrayList<Object[]>();
		
			
		laclist = stc.listlecture();
		System.out.println(laclist.get(1)[0].toString());

		m.addAttribute("lacturedata", laclist);
		
			return "LectureScheduleListing"; // redirect no hoi to jsp page
		}
	  
	  

	@RequestMapping(value = "/savelectureschedule", method = RequestMethod.GET)
	public ModelAndView saveLectureSchedule(@ModelAttribute LectureScheduleBean lectureScheduleBean,
			BindingResult result) {
		LectureSchedule lectureSchedule = prepareModel(lectureScheduleBean);
		
		String[] sub = 	lectureSchedule.getSubjectname().split(",");
		String[] started = 	lectureSchedule.getLectureschedule_From().split(",");
		String[] ended = lectureSchedule.getLectureschedule_To().split(",");
		String[] dt = lectureSchedule.getLectureschedule_Date().split(",");

		LectureSchedule main = new LectureSchedule();
		
		for (int i = 0; i < 4; i++) {
			
			main.setSubjectname(sub[i]); 
			
			main.setLectureschedule_From(started[i]); 
			
			main.setLectureschedule_To(ended[i]); 
			
			main.setLectureschedule_Date(dt[i]);

			
			lectureScheduleService.addlectureschedule(main);
			
			main = new LectureSchedule();

			
		}
		
		
		System.out.println(lectureScheduleBean);
		return new ModelAndView("redirect:/addlectureschedule");// redirect hoi to method nu name
	}

	
	  @RequestMapping(value = "/addlectureschedule", method = RequestMethod.GET)
	  public ModelAndView addlectureschedule(@ModelAttribute
		LectureScheduleBean lectureScheduleBean, BindingResult result) {
		  System.out.println("lectureScheduleBean : "+lectureScheduleBean);
			Map<String, Object> model = new HashMap<String, Object>(); //
//			model.put("lectureschedules", prepareListofBean(lectureScheduleService.listLectureSchedules()));
			return new ModelAndView("addlectureschedule"); // redirect no hoi to jsp page
		}
//	 
	
		
	private LectureSchedule prepareModel(LectureScheduleBean lectureScheduleBean) {
		LectureSchedule lectureSchedule = new LectureSchedule();
		// if(inquiryBean.getInquiryId()!=0)
		// {

		// }

		//lectureSchedule.setLectureschedule_Id(lectureScheduleBean.getLectureschedule_Id());
		//lectureSchedule.setCourse_Id(lectureScheduleBean.getCourse_Id());
		//lectureSchedule.setSubject_Id(lectureScheduleBean.getSubject_Id());
		lectureSchedule.setSubjectname(lectureScheduleBean.getSubject());

		lectureSchedule.setLectureschedule_Date(lectureScheduleBean.getScheduleDate());
		lectureSchedule.setLectureschedule_From(lectureScheduleBean.getStartTime());
		lectureSchedule.setLectureschedule_To(lectureScheduleBean.getToTime());

		// departmentBean.setDeptId(null);
		return lectureSchedule;
	}
	
	


}
