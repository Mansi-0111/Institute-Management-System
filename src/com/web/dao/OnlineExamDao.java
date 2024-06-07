package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.bean.OnlineExamBean;

public class OnlineExamDao {
	public static List<OnlineExamBean> getOnlineExamQuestion(int courseId) {
		List<OnlineExamBean> list = new ArrayList<OnlineExamBean>();
		try {
			Connection conn = ConnectionDB.getConnection();
			String loginQuery = "select * from exam_qa where course_id = ?";
			PreparedStatement ps = conn.prepareStatement(loginQuery);
			ps.setInt(1, courseId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				OnlineExamBean examBean = new OnlineExamBean();
				examBean.setExam_qa_Id(rs.getInt("exam_qa_id"));
				examBean.setCorrectAns(rs.getString("correctans"));
				examBean.setCourse_Id(rs.getInt("course_id"));
				examBean.setExam_Question(rs.getString("exam_question"));
				examBean.setOptionE1(rs.getString("option1"));
				examBean.setOptionE2(rs.getString("option2"));
				examBean.setOptionE3(rs.getString("option3"));
				examBean.setOptionE4(rs.getString("option4"));
				list.add(examBean);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

}
