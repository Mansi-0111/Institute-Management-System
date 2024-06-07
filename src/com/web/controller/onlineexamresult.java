package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.bean.LoggerInfo;
import com.web.dao.OnlineExamResult;
import com.web.dao.SignUpDao;

/**
 * Servlet implementation class onlineexamresult
 */
@WebServlet("/onlineexamresult")
public class onlineexamresult extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public onlineexamresult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		LoggerInfo loggerInfo = (LoggerInfo)session.getAttribute("loggerInfo");

		int courseId, score, userId;
		courseId =Integer.parseInt(request.getParameter("courseId").toString());
		score =Integer.parseInt(request.getParameter("score").toString());
		userId = loggerInfo.getUser_master_id();

		OnlineExamResult.storeResult(courseId, score, userId);
		response.sendRedirect("index.jsp");
	}

}
