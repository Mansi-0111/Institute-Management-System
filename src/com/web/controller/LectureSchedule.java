package com.web.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bean.LectureBean;
import com.web.bean.MeetingBean;
import com.web.dao.ConnectionDB;
import com.web.dao.MeetingDao;

/**
 * Servlet implementation class LectureSchedule
 */
@WebServlet("/LectureSchedule")
public class LectureSchedule extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LectureSchedule() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<LectureBean> list = new ArrayList<LectureBean>();
		try {
			Connection conn = ConnectionDB.getConnection();
			String sql = "SELECT concat(lectureschedule_from,' - ',lectureschedule_to) as timing, MAX(CASE WHEN lectureschedule_date = date(now()) THEN subjectname END) AS `Today`, MAX(CASE WHEN lectureschedule_date = date(now() + interval 1 day) THEN subjectname END) AS `Tomorrow` FROM lectureschedule GROUP BY lectureschedule_from, lectureschedule_to ORDER BY 1";	
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				LectureBean bean = new LectureBean();
				bean.setTiming(rs.getString("timing"));
				bean.setToday(rs.getString("Today"));
				bean.setTomorrow(rs.getString("Tomorrow"));
				list.add(bean);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	    request.setAttribute("lectureList", list);
	    RequestDispatcher rd = request.getRequestDispatcher("LectureSchedule.jsp");
	    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
