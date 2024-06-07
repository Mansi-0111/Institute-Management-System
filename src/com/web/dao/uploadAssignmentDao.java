package com.web.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.web.bean.OnlineExamBean;
import com.web.bean.uploadassignmentBean;

public class uploadAssignmentDao {
	/*public static uploadassignmentBean getdetail()
	{
		uploadassignmentBean bean=new uploadassignmentBean();
		try {
			Connection conn=ConnectionDB.getConnection(); 
			String sql="select * from assignment_upload";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				bean.setQue(rs.getString("assignment_que"));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return bean;
	}*/
	
	public static List<uploadassignmentBean> getQuestion() {
		List<uploadassignmentBean> list = new ArrayList<uploadassignmentBean>();
		try {
			Connection conn = ConnectionDB.getConnection();
			String sql="SELECT *,(SELECT course_name FROM admin.course where course_id = a.course_id) as coursename FROM admin.assignment_upload a";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				uploadassignmentBean bean = new uploadassignmentBean();
				bean.setQue(rs.getString("assignment_que"));
				bean.setCourse_Id(rs.getInt("course_id"));
				bean.setCourseName(rs.getString("coursename"));
				list.add(bean);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}

}
