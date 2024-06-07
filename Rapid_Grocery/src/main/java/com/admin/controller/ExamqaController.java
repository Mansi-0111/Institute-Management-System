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
import com.admin.bean.ExamqaBean;
import com.admin.bean.UserMasterBean;
import com.admin.model.Course;
import com.admin.model.Exam_QA;
import com.admin.model.UserMaster;
import com.admin.service.ExamqaService;

@Controller
public class ExamqaController {
	
	@Autowired
	private ExamqaService examqaService;
	
	@RequestMapping(value = "/saveexamqa", method = RequestMethod.POST)
	public ModelAndView saveExamqa(@ModelAttribute("examqa") ExamqaBean examqaBean, 
			BindingResult result) {
		Exam_QA exam_QA = prepareModel(examqaBean);
		examqaService.addExamqa(exam_QA);
		return new ModelAndView("redirect:/addexamqa");//redirect hoi to method nu name
	}
	
	/*
	 * @RequestMapping(value = "/addexamqa", method = RequestMethod.GET) public
	 * ModelAndView addDepartment(@ModelAttribute("examqa")ExamqaBean examqaBean,
	 * BindingResult result) { Map<String, Object> model = new HashMap<String,
	 * Object>(); model.put("examqas",
	 * prepareListofBean(examqaService.listExam_QAs())); model.put("courses",
	 * prepareListofBeanForCourse(examqaService.listCourses()));
	 * model.put("faculty",
	 * prepareListofBeanForFaculty(examqaService.listUserMasters())); return new
	 * ModelAndView("ExamqaAdd",model);//redirect no hoi to jsp page }
	 */
	
	private Exam_QA prepareModel(ExamqaBean examqaBean){
		Exam_QA exam_QA = new Exam_QA();
		if(examqaBean.getExam_qa_Id()!=0)
		{
			exam_QA.setExam_qa_Id(examqaBean.getExam_qa_Id());
		}
		exam_QA.setCourse_Id(examqaBean.getCourse_Id());
		exam_QA.setUser_master_Id(examqaBean.getUser_master_Id());
		exam_QA.setExam_Question(examqaBean.getExam_Question());
		exam_QA.setOptionE1(examqaBean.getOptionE1());
		exam_QA.setOptionE2(examqaBean.getOptionE2());
		exam_QA.setOptionE3(examqaBean.getOptionE3());
		exam_QA.setOptionE4(examqaBean.getOptionE4());
		exam_QA.setCorrectAns(examqaBean.getCorrectAns());
		//exam_QA.setExam_Answer(examqaBean.getExam_Answer());
		
		//departmentBean.setDeptId(null);
		return exam_QA;
	}
	
	@RequestMapping(value="/examqas", method = RequestMethod.GET)
	public ModelAndView listExam_QAs() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("examqas",  prepareListofBean(examqaService.listExam_QAs()));
		model.put("courses",  prepareListofBeanForCourse(examqaService.listCourses()));
		model.put("examqas",  prepareListofBean(examqaService.listExam_QAs()));
		 model.put("faculty", prepareListofBeanForFaculty(examqaService.listUserMasters(),4)); 
		return new ModelAndView("ExamListing", model);
	}
	
	@RequestMapping(value = "/deleteexamqa", method = RequestMethod.GET)
	public ModelAndView editExam_QA(@ModelAttribute("examqa")  ExamqaBean examqaBean,
			BindingResult result) {
		examqaService.deleteExam_QA(prepareModel(examqaBean));
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("examqa", null);
		model.put("examqas",  prepareListofBean(examqaService.listExam_QAs()));
		 model.put("faculty", prepareListofBeanForFaculty(examqaService.listUserMasters(),4)); 
		return new ModelAndView("redirect:/addexamqa", model);
	}
	
	@RequestMapping(value = "/editexamqa", method = RequestMethod.GET)
	public ModelAndView deleteExam_QA(@ModelAttribute("examqa")  ExamqaBean examqaBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("examqa", prepareExamqaBean(examqaService.getExam_QA(examqaBean.getExam_qa_Id())));
		 model.put("courses", prepareListofBeanForCourse(examqaService.listCourses()));
		 model.put("faculty", prepareListofBeanForFaculty(examqaService.listUserMasters(),4)); 
		model.put("examqas",  prepareListofBean(examqaService.listExam_QAs()));
		return new ModelAndView("ExamqaAdd", model);//jsp
	}
	
	private ExamqaBean prepareExamqaBean(Exam_QA exam_QA){
		ExamqaBean examqaBean = new ExamqaBean();
		examqaBean.setExam_qa_Id(exam_QA.getExam_qa_Id());
		examqaBean.setExam_Question(exam_QA.getExam_Question());
		examqaBean.setOptionE1(exam_QA.getOptionE1());
		examqaBean.setOptionE2(exam_QA.getOptionE2());
		examqaBean.setOptionE3(exam_QA.getOptionE3());
		examqaBean.setOptionE4(exam_QA.getOptionE4());
		examqaBean.setCorrectAns(exam_QA.getCorrectAns());
		
		
		return examqaBean;
	}
	
	private List<ExamqaBean> prepareListofBean(List<Exam_QA> examqas){
		List<ExamqaBean> examqabeans = null;
		if(examqas != null && !examqas.isEmpty()){
			examqabeans = new ArrayList<ExamqaBean>();
			ExamqaBean examqaBean = null;
			for(Exam_QA exam_QA :examqas){
				examqaBean = new ExamqaBean();
				examqaBean.setExam_qa_Id(exam_QA.getExam_qa_Id());
				examqaBean.setCourse_Id(exam_QA.getCourse_Id());
				examqaBean.setUser_master_Id(exam_QA.getUser_master_Id());
				examqaBean.setExam_Question(exam_QA.getExam_Question());
				examqaBean.setOptionE1(exam_QA.getOptionE1());
				examqaBean.setOptionE2(exam_QA.getOptionE2());
				examqaBean.setOptionE3(exam_QA.getOptionE3());
				examqaBean.setOptionE4(exam_QA.getOptionE4());
				examqaBean.setCorrectAns(exam_QA.getCorrectAns());
				//examqaBean.setExam_Answer(exam_QA.getExam_Answer());
				examqabeans.add(examqaBean);
			}
		}
		return examqabeans;
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
	
	
	private List<UserMasterBean> prepareListofBeanForFaculty(List<UserMaster> studentRegistrations,int User_type_Id){
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
