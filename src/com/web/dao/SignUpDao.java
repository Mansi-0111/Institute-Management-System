package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.web.bean.LoggerInfo;
import com.web.bean.SignUpBean;

public class SignUpDao {

	public static int signUp(SignUpBean bean) {
		int returnValue = 0;
		try {
			Connection conn = ConnectionDB.getConnection();
			String insertQuery = "INSERT INTO `usermaster`(`course_id`, `user_addmissiondate`, `user_address`, `user_contact`, `user_dob`, `user_email`, `user_fname`,"
					+ " `user_gender`, `user_lname`, `user_parentcontact`, `user_parentemail`, `user_parentfname`, `user_password`, `user_type_id`) VALUES "
					+ "(?,now(),?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insertQuery,
			        Statement.RETURN_GENERATED_KEYS);
			ps.setInt(1, bean.getCourse_id());
			ps.setString(2, bean.getUser_address());
			ps.setString(3, bean.getUser_contact());
			ps.setString(4, bean.getUser_dob());
			ps.setString(5, bean.getUser_email());
			ps.setString(6, bean.getUser_fname());
			ps.setString(7, bean.getUser_gender());
			ps.setString(8, bean.getUser_lname());
			ps.setString(9, bean.getUser_parentcontact());
			ps.setString(10, bean.getUser_parentemail());
			ps.setString(11, bean.getUser_parentfname());
			ps.setString(12, bean.getUser_password());
			ps.setInt(13, 3);

			ps.executeUpdate();
			ResultSet res = ps.getGeneratedKeys();
		    while (res.next()) {
		    	returnValue = Integer.parseInt(res.getString(1));
		    }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		System.out.println("returnValue : "+returnValue);
		return returnValue;
	}

	public static LoggerInfo checkLogin(String userName, String userPassword) {
		LoggerInfo info = null;
		try {
			Connection conn = ConnectionDB.getConnection();
			String loginQuery = "select * from usermaster where user_email = ? and user_password = ?";
			PreparedStatement ps = conn.prepareStatement(loginQuery);
			ps.setString(1, userName);
			ps.setString(2, userPassword);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				info = new LoggerInfo();
				info.setUser_type_id(rs.getInt("user_type_id"));
				info.setUser_master_id(rs.getInt("user_master_id"));
				info.setUserEmail(rs.getString("user_email"));
				info.setUserName(rs.getString("user_fname") + " " + rs.getString("user_lname"));
				info.setUserAddress(rs.getString("user_address"));
				info.setUserContact(rs.getString("user_contact"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return info;
	}
	
	public static LoggerInfo checkLogin(String userName) {
		LoggerInfo info = new LoggerInfo();
		try {
			Connection conn = ConnectionDB.getConnection();
			String loginQuery = "select * from usermaster where user_email = ?";
			PreparedStatement ps = conn.prepareStatement(loginQuery);
			ps.setString(1, userName);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				//info.setUser_type_id(rs.getInt("usertypeid"));
				//info.setUser_master_id(rs.getInt("usermasterid"));
				info.setUser_type_id(rs.getInt("user_type_id"));
				info.setUser_master_id(rs.getInt("user_master_id"));
				info.setUserEmail(rs.getString("user_email"));
				info.setUserName(rs.getString("user_fname") + " " + rs.getString("user_lname"));
				info.setUserAddress(rs.getString("user_address"));
				info.setUserContact(rs.getString("user_contact"));
				info.setUserPassword(rs.getString("user_password"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return info;
	}
}
