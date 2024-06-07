package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.web.bean.InquiryBean;
import com.web.bean.LoggerInfo;
import com.web.bean.SignUpBean;

public class InquiryDao {

	public static int Inquiry(InquiryBean bean) {
		try {
			Connection conn = ConnectionDB.getConnection();
			String insertQuery = "INSERT INTO `inquiry`( `inquiryadd`, `inquirymail`, `inquiryname`, `inquiryquery`) VALUES "
					+ "(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			//ps.setInt(1, bean.getInquiryid());
			ps.setString(1, bean.getInquiryadd());
			ps.setString(2, bean.getInquirymail());
			ps.setString(3, bean.getInquiryname());
			ps.setString(4, bean.getInquiryquery());
			
			int i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	/*public static LoggerInfo checkLogin(String userName, String userPassword) {
		LoggerInfo info = new LoggerInfo();
		try {
			Connection conn = ConnectionDB.getConnection();
			String loginQuery = "select * from usermaster where user_email = ? and user_password = ?";
			PreparedStatement ps = conn.prepareStatement(loginQuery);
			ps.setString(1, userName);
			ps.setString(2, userPassword);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				info.setUserEmail(rs.getString("user_email"));
				info.setUserName(rs.getString("user_fname") + " " + rs.getString("user_lname"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return info;
	}*/
}
