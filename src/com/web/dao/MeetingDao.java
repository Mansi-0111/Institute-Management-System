package com.web.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.bean.MeetingBean;

public class MeetingDao {

	public static List<MeetingBean> getMeetingDetails() {
		List<MeetingBean> list = new ArrayList<MeetingBean>();
		try {
			Connection conn = ConnectionDB.getConnection();
			String loginQuery = "select * from meeting_request";
			PreparedStatement ps = conn.prepareStatement(loginQuery);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MeetingBean bean = new MeetingBean();
				bean.setMeetingLink(rs.getString("meeting_link"));
				bean.setMeetingTopic(rs.getString("topic"));
				bean.setMeetingDate(rs.getString("meeting_date_time"));
				list.add(bean);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

	

}
