package com.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bean.OnlineExamBean;
import com.web.dao.OnlineExamDao;

/**
 * Servlet implementation class onlineexam
 */
@WebServlet("/onlineexam")
public class onlineexam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public onlineexam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside Get Method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Inside Post Method");
		int courseId = Integer.parseInt(request.getParameter("courseId").toString());
		List<OnlineExamBean> examList = OnlineExamDao.getOnlineExamQuestion(courseId);
		request.setAttribute("OnlineExam", examList);
		RequestDispatcher rd = request.getRequestDispatcher("onlineexamstart.jsp");
		rd.forward(request, response);
	}

}
