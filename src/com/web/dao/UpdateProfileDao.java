package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateProfileDao {

	public static int updateProfile(String userAddress, String userContact, int userId) {
		try {
			Connection conn = ConnectionDB.getConnection();
			String insertQuery = "update usermaster set user_address = ?, user_contact = ? where user_master_id = ?";
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			ps.setString(1, userAddress);
			ps.setString(2, userContact);
			ps.setInt(3, userId);
			int i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

}
