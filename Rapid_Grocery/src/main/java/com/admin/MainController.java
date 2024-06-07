package com.admin;

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

import com.admin.bean.AssignmentBean;
import com.admin.bean.AssignmentUploadBean;
import com.admin.bean.CourseBean;
import com.admin.bean.ExamScheduleBean;
import com.admin.bean.ExamqaBean;
import com.admin.bean.FeeBean;
import com.admin.bean.LoginBean;
import com.admin.bean.MeetingreqBean;
import com.admin.bean.OnlineExamBean;
import com.admin.bean.SalaryBean;
import com.admin.bean.UserMasterBean;
import com.admin.bean.UserTypeBean;
import com.admin.dao.DashboardDao;
import com.admin.model.Assignment;
import com.admin.model.Assignment_upload;
import com.admin.model.Course;
import com.admin.model.ExamSchedule;
import com.admin.model.Exam_QA;
import com.admin.model.Fee;
import com.admin.model.Meeting_request;
import com.admin.model.OnlineExam;
import com.admin.model.Salary;
import com.admin.model.UserMaster;
import com.admin.model.UserType;
import com.admin.service.AssignmentService;
import com.admin.service.AssignmentuploadService;
import com.admin.service.ExamScheduleService;
import com.admin.service.ExamqaService;
import com.admin.service.FacultyService;
import com.admin.service.FeeService;
import com.admin.service.MeetingreqService;
import com.admin.service.OnlineExamService;
import com.admin.service.SalaryService;
import com.admin.service.StaffService;
import com.admin.service.StudentRegistrationService;

@Controller
public class MainController {

	@RequestMapping("/")	
	public ModelAndView viewHome(@ModelAttribute("loginBean") LoginBean loginBean, 
			BindingResult result) {
		return new ModelAndView("login");
	}

	@RequestMapping("/addcustomer")
	public ModelAndView addcustomer() {
		return new ModelAndView("addcustomer");
	}
	@RequestMapping("/employees")
	public ModelAndView employees() {
		return new ModelAndView("addEmployee");
	}

	@Autowired
	private StudentRegistrationService studentRegistrationService;

	@RequestMapping(value = "/addstudent", method = RequestMethod.GET)
	public ModelAndView addStudent(@ModelAttribute("sturegistration") UserMasterBean userMasterBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("userTypes",  prepareListofBeanForUser(studentRegistrationService.listUserTypes()));
		model.put("studentregistrations",  prepareListofBean(studentRegistrationService.listStudentRegistrations(),3));
		model.put("courses",  prepareListofBeanForCourse(studentRegistrationService.listCourses()));
		return new ModelAndView("AddStudents",model);
	}
	
	@Autowired
	private FacultyService facultyService;
	
	@RequestMapping(value = "/addfaculty", method = RequestMethod.GET)
	public ModelAndView addFaculty(@ModelAttribute("facultyregistration")  UserMasterBean userMasterBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("userTypes", prepareListofBeanForUser(facultyService.listUserTypes()));
		model.put("courses",  prepareListofBeanForCourse(facultyService.listCourses()));
		model.put("facultyregistrations",  prepareListofBean(facultyService.listFacultyRegistrations(),4));
		return new ModelAndView("facultyAdd",model);
	}
	
	@Autowired
	private StaffService staffService;

	@RequestMapping(value = "/addstaff", method = RequestMethod.GET)
	public ModelAndView addStaff(@ModelAttribute("staffregistration")  UserMasterBean userMasterBean,
			BindingResult result) {
			Map<String, Object> model = new HashMap<String, Object>();
			model.put("userTypes", prepareListofBeanForUser(staffService.listUserTypes()));
			model.put("courses",  prepareListofBeanForCourse(staffService.listCourses()));
			model.put("staffregistrations",  prepareListofBean(staffService.listStaffRegistrations(),2));
		return new ModelAndView("staffAdd",model);
	}
	
	@Autowired
	private AssignmentuploadService assignmentService;
	
	@RequestMapping(value = "/addassignment", method = RequestMethod.GET)
	public ModelAndView addAssignment(@ModelAttribute("assignment") AssignmentBean assignmentBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		//model.put("assignments",  prepareListofBeanAssignment(assignmentService.listAssignments()));
		model.put("students",  prepareListofBeanForusers(assignmentService.listUserMasters(),4));
		return new ModelAndView("AssignmentAdd",model);
	}
	
	@Autowired
	private AssignmentuploadService assignmentuploadService;
	
	@RequestMapping(value = "/adduploadassignment", method = RequestMethod.GET)
	public ModelAndView addAssignment(@ModelAttribute("assignment") AssignmentUploadBean
			assignmentBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("courses",  prepareListofBeanForCourse(assignmentuploadService.listCourses()));
		//model.put("assignments",  prepareListofBeanAssignment(assignmentService.listAssignments()));
		model.put("students",  prepareListofBeanForusers(assignmentuploadService.listUserMasters(),4));
		return new ModelAndView("AssignmentAdd",model);
	}
	
	@Autowired
	private ExamScheduleService examScheduleService;
	
	@RequestMapping(value = "/addexamschedule", method = RequestMethod.GET)
	public ModelAndView addExamSchedule(@ModelAttribute("examschedule")  ExamScheduleBean examScheduleBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("courses",  prepareListofBeanForCourse(examScheduleService.listCourses()));
		model.put("faculty",  prepareListofBeanForFaculty(examScheduleService.listUserMasters(),4));
		model.put("examschedules",  prepareListofBeanEs(examScheduleService.listExamSchedules()));
		return new ModelAndView("ExamScheduleAdd", model);
	}
	
	@Autowired
	private FeeService feeService;
	@RequestMapping(value = "/addfee", method = RequestMethod.GET)
	public ModelAndView addFee(@ModelAttribute("fee") FeeBean feeBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("fees",  prepareListofBeanFee(feeService.listFees()));
		model.put("courses",  prepareListofBeanForCourse(feeService.listCourses()));
		model.put("students",  prepareListofBeanForStudent(feeService.listUserMasters(),3));
		return new ModelAndView("feeAdd",model);
	}
	
	@Autowired
	private OnlineExamService onlineExamService;
	
	@RequestMapping(value = "/addonlineexam", method = RequestMethod.GET) 
	public ModelAndView addOnlineExam(@ModelAttribute("onlineexam") OnlineExamBean onlineExamBean,
	BindingResult result) { Map<String, Object> model = new HashMap<String, Object>();
	  model.put("onlineexams",prepareListofBeanExam(onlineExamService.listOnlineExams()));
	  model.put("courses",
	  prepareListofBeanForCourse(onlineExamService.listCourses()));
	  model.put("students",prepareListofBeanForStudent(onlineExamService.listUserMasters(),3));
	  return new ModelAndView("OnlineExamAdd",model); }
	
	@Autowired
	private SalaryService salaryService;
	
	@RequestMapping(value = "/addsalary", method = RequestMethod.GET)
	public ModelAndView addSalary(@ModelAttribute("salary")  SalaryBean salaryBean,
			BindingResult result) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("salarys",  prepareListofBeanSalary(salaryService.listSalaries()));
		model.put("users",  prepareListofBeanForusers(salaryService.listUserMasters(),2,4));
		return new ModelAndView("salaryAdd",model);
	}

	
	@Autowired
	private ExamqaService examqaService;
	
	  @RequestMapping(value = "/addexamqa", method = RequestMethod.GET)
	  public ModelAndView addDepartment(@ModelAttribute("examqa")ExamqaBean examqaBean,
	  BindingResult result)
	  { Map<String, Object> model = new HashMap<String,
	  Object>(); model.put("examqas",prepareListofBeanqa(examqaService.listExam_QAs())); 
	  model.put("courses", prepareListofBeanForCourse(examqaService.listCourses()));
	  model.put("faculty", prepareListofBeanForFaculty(examqaService.listUserMasters(),4)); 
	  return new ModelAndView("ExamqaAdd",model);//redirect no hoi to jsp page }
	 
	  }
	
	@RequestMapping("/addfeedback")
	public ModelAndView addfeedback() {
		return new ModelAndView("FeedbackAdd");
	}
	@RequestMapping("/addinquiry")
	public ModelAndView addinquiry() {
		return new ModelAndView("InquiryAdd");
	}
	
	
	@RequestMapping("/meetingreqs")
	public ModelAndView addmeetingreq() {
		return new ModelAndView("Meetingreq");
	}
	
	@Autowired
	private MeetingreqService meetingreqService;
	
	  
	  @RequestMapping(value = "/addmeetingreq", method = RequestMethod.GET) public
	  ModelAndView addMeetingreq(@ModelAttribute("meetingreq")MeetingreqBean
	  meetingreqBean, BindingResult result) { Map<String, Object> model = new
	  HashMap<String, Object>(); model.put("meetingreqbeans",
	  prepareListofBean(meetingreqService.listMeeting_requests()));
	  model.put("courses", prepareListofBeanForCourse(meetingreqService.listCourses()));
	  return new
	  ModelAndView("Meetingreq",model);
	  }//redirect no hoi to jsp page
	
	@RequestMapping("/lectureschedule")
	public ModelAndView lectureschedule() {
		return new ModelAndView("LectureScheduleListing");
	}

	private List<UserTypeBean> prepareListofBeanForUserType(List<UserType> userTpeList){
		List<UserTypeBean> beans = null;
		if(userTpeList != null && !userTpeList.isEmpty()){
			beans = new ArrayList<UserTypeBean>();
			UserTypeBean bean = null;
			for(UserType userType : userTpeList){
				
				
				bean = new UserTypeBean();
				bean.setUser_type_Id(userType.getUser_type_Id());
				bean.setUser_type_Name(userType.getUser_type_Name());
				beans.add(bean);
			
			}
		}
		return beans;
	}
	
	private List<CourseBean> prepareListofBeanForCourse(List<Course> courseList){
		List<CourseBean> beans = null;
		if(courseList != null && !courseList.isEmpty()){
			beans = new ArrayList<CourseBean>();
			CourseBean bean = null;
			for(Course course : courseList){
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
	
	private List<UserMasterBean> prepareListofBeanForusers(List<UserMaster> studentRegistrations,int User_type_Id){
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
	private List<AssignmentBean> prepareListofBeanAssignment(List<Assignment> assignments){
		List<AssignmentBean> beans = null;
		if(assignments != null && !assignments.isEmpty()){
			beans = new ArrayList<AssignmentBean>();
			AssignmentBean bean = null;
			for(Assignment assignment : assignments){
				bean = new AssignmentBean();
				bean.setAssignment_Id(assignment.getAssignment_Id());
				bean.setUser_master_Id(assignment.getUser_master_Id());
				bean.setAssignment_Email(assignment.getAssignment_Email());
				bean.setAssignment_Submissiondate(assignment.getAssignment_Submissiondate());
				bean.setAssignment_Pdf(assignment.getAssignment_Pdf());
				beans.add(bean);
			}
		}
		return beans;
	}
	private List<ExamScheduleBean> prepareListofBeanEs(List<ExamSchedule> examSchedules){
		List<ExamScheduleBean> beans = null;
		if(examSchedules != null && !examSchedules.isEmpty()){
			beans = new ArrayList<ExamScheduleBean>();
			ExamScheduleBean bean = null;
			for(ExamSchedule examSchedule : examSchedules){
				bean = new ExamScheduleBean();
				bean.setExamschedule_Id(examSchedule.getExamschedule_Id());
				bean.setExamschedule_Date(examSchedule.getExamschedule_Date());
				bean.setCourse_Id(examSchedule.getCourse_Id());
				bean.setUser_master_Id(examSchedule.getUser_master_Id());
				beans.add(bean);
			}
		}
		return beans;
	}
	private List<FeeBean> prepareListofBeanFee(List<Fee> fees){
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
				bean.setCourse_Name(fee.getCourse_Name());
				beans.add(bean);
			}
		}
		return beans;
	}
	private List<SalaryBean> prepareListofBeanSalary(List<Salary> salarys){
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
	private List<ExamqaBean> prepareListofBeanqa(List<Exam_QA> examqas){
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
	
	private List<OnlineExamBean> prepareListofBeanExam(List<OnlineExam> onlineExams){
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
	private Meeting_request prepareModel(MeetingreqBean meetingreqBean){
		Meeting_request meeting_request = new Meeting_request();
		if(meetingreqBean.getMeeting_Req_id()!=0)
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
	
	
	
}

