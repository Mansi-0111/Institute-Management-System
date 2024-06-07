package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class meetingAttendanceDao {
	public static int meetingAttendance(int userId) {
		try {
			Connection conn = ConnectionDB.getConnection();
			String insertQuery = "INSERT INTO `meeting_attendence`(`meeting_date`, `user_master_id`) VALUES "
					+ "(now(),?)";
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			ps.setInt(1, userId);
			int i = ps.executeUpdate();
			System.out.print("Hello");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

}
