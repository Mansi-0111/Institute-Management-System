package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.web.bean.FeedbackBean;
import com.web.bean.SignUpBean;

public class FeedbackDao {

	public static int Feedback(FeedbackBean bean) {
		try {
			Connection conn = ConnectionDB.getConnection();
			String insertQuery = "INSERT INTO `feedback`(`description`, `feedbackemail`, `feedbackrate`) VALUES "
					+ "(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			ps.setString(1, bean.getDescription());
			ps.setString(2, bean.getFeedbackemail());
			ps.setString(3, bean.getFeedbackrate());
			
			int i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

}
