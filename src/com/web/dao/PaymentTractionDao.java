package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PaymentTractionDao {


	public static int paymentTrancation(String courseName, String orderId, int amount, int userId) {
		try {
			Connection conn = ConnectionDB.getConnection();
			String insertQuery = "INSERT INTO `admin`.`payment_traction` (`course_name`, `order_id`, `payment_date`, `amount`, `usermaster_id`) VALUES (?, ?, now(), ?, ?)";
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			ps.setString(1, courseName);
			ps.setString(2, orderId);
			ps.setInt(3, amount);
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
