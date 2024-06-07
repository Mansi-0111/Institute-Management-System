package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import com.web.bean.LoggerInfo;

public class UploadFileDao {
	public static int uploadFile(HttpSession session, String fileName) {
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
			Date d = new Date();
			LoggerInfo loggerInfo = (LoggerInfo)session.getAttribute("loggerInfo");
			Connection conn = ConnectionDB.getConnection();
			String insertQuery = "INSERT INTO `assignment`(`assignment_email`, `assignment_pdf`, `assignment_submissiondate`, `user_master_id`) VALUES "
					+ "(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(insertQuery);
			ps.setString(1, loggerInfo.getUserEmail());
			ps.setString(2, fileName);
			ps.setString(3, dateFormat.format(d));
			ps.setInt(4, loggerInfo.getUser_master_id());
			
			int i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

}
