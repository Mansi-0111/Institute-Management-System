package com.admin.dao;

import java.util.List;

import com.admin.model.LectureSchedule;

public interface LectureScheduleDao {
	
	public void addlectureschedule(LectureSchedule lectureSchedule);
	
	
	public List<LectureSchedule> listLectureSchedules() ;
	/*
	 * public List<LectureSchedule> listLectureSchedules() ;
	 * 
	 * public LectureSchedule getLectureSchedule(int lectureschedule_id);
	 * 
	 * public void deleteLectureSchedule(LectureSchedule lectureSchedule) ;
	 */
}
