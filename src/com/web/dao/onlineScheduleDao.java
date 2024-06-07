package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.bean.ExamResult;
import com.web.bean.OnlineExamSchedule;

public class onlineScheduleDao {

	public static List<OnlineExamSchedule> getExamSchedule() {
		List<OnlineExamSchedule> list = new ArrayList<OnlineExamSchedule>();
		try {
			Connection conn = ConnectionDB.getConnection();
			String loginQuery = "SELECT e.examschedule_id, e.course_id,DATE_FORMAT(e.examschedule_date, '%d-%m-%Y') exam_date,c.course_name FROM admin.examschedule e inner join admin.course c on e.course_id=c.course_id where DATE_FORMAT(e.examschedule_date, '%d-%m-%Y') = DATE_FORMAT(CURDATE(), '%d-%m-%Y')";
			PreparedStatement ps = conn.prepareStatement(loginQuery);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				OnlineExamSchedule examSchedule = new OnlineExamSchedule();
				examSchedule.setExamScheduleId(rs.getInt("examschedule_id"));
				examSchedule.setCourseId(rs.getInt("course_id"));
				examSchedule.setExamDate(rs.getString("exam_date"));
				examSchedule.setCourseName(rs.getString("course_name"));
				list.add(examSchedule);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}

	public static List<ExamResult> getExamResult(int userId) {
		List<ExamResult> list = new ArrayList<ExamResult>();
		try {
			Connection conn = ConnectionDB.getConnection();
			String loginQuery = "SELECT obtain_marks, total_marks, DATE_FORMAT(e.exam_date, '%d-%m-%Y') exam_date, (select course_name from course where course_id = e.course_id) courseName FROM admin.onlineexam e  where e.user_master_id=?";
			PreparedStatement ps = conn.prepareStatement(loginQuery);
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();
			int i = 1;
			while (rs.next()) {
				ExamResult examResult = new ExamResult();
				examResult.setSrNo(i);
				examResult.setScore(rs.getInt("obtain_marks"));
				examResult.setTotalScore(rs.getInt("total_marks"));
				examResult.setExamDate(rs.getString("exam_date"));
				examResult.setCourseName(rs.getString("courseName"));
				list.add(examResult);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return list;
	}	
}
