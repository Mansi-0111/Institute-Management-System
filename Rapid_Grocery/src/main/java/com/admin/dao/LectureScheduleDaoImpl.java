package com.admin.dao;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.admin.model.ExamSchedule;
import com.admin.model.LectureSchedule;
import com.admin.model.Salary;
import com.admin.model.UserMaster;


@Repository("lecturescheduleDao")
public class LectureScheduleDaoImpl  implements LectureScheduleDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void addlectureschedule(LectureSchedule lectureSchedule) {
		sessionFactory.getCurrentSession().saveOrUpdate(lectureSchedule);
	}


	@SuppressWarnings("unchecked")
	public List<LectureSchedule> listLectureSchedules() {
		return (List<LectureSchedule>) sessionFactory.getCurrentSession().createCriteria(LectureSchedule.class).list();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @SuppressWarnings("unchecked") public List<LectureSchedule>
	 * listLectureSchedules() { return (List<LectureSchedule>)
	 * sessionFactory.getCurrentSession().createCriteria(LectureSchedule.class).list
	 * (); } //id>0 update id==0 insert public LectureSchedule
	 * getLectureSchedule(int lectureschedule_id) { return (LectureSchedule)
	 * sessionFactory.getCurrentSession().get(LectureSchedule.class,
	 * lectureschedule_id); }
	 * 
	 * public void deleteLectureSchedule(LectureSchedule lectureSchedule) {
	 * sessionFactory.getCurrentSession().
	 * createQuery("DELETE FROM LectureSchedule WHERE lectureschedule_Id = "
	 * +lectureSchedule.getLectureschedule_Id()).executeUpdate(); }
	 */
}
