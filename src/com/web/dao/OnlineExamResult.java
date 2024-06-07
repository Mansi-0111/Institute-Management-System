package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OnlineExamResult {
	public static int storeResult(int courseId, int score, int userId) {
		try {
			Connection conn = ConnectionDB.getConnection();
			String insertQuery = "INSERT INTO admin.onlineexam (course_id, obtain_marks, total_marks, user_master_id, exam_date) VALUES (?,?,?,?,now())";
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			ps.setInt(1, courseId);
			ps.setInt(2, score);
			ps.setInt(3, 10);
			ps.setInt(4, userId);

			int i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

}
