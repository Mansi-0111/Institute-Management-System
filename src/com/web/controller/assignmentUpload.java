package com.web.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.bean.LoggerInfo;
import com.web.bean.OnlineExamBean;
import com.web.bean.uploadassignmentBean;
import com.web.dao.OnlineExamDao;
import com.web.dao.SignUpDao;
import com.web.dao.uploadAssignmentDao;

/**
 * Servlet implementation class assignmentUpload
 */
@WebServlet("/assignmentUpload")
public class assignmentUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public assignmentUpload() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		List<uploadassignmentBean> queList = uploadAssignmentDao.getQuestion();
		request.setAttribute("Question", queList);
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("uploadAssignment.jsp");
	    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*String que1,que2,que3,que4,que5,que6,que7,que8,course_ID;
		que1=request.getParameter("assignment_que1").toString();
		que2=request.getParameter("assignment_que2").toString();
		que3=request.getParameter("assignment_que3").toString();
		que4=request.getParameter("assignment_que4").toString();
		que5=request.getParameter("assignment_que5").toString();
		que6=request.getParameter("assignment_que6").toString();
		que7=request.getParameter("assignment_que7").toString();
		que8=request.getParameter("assignment_que8").toString();
		course_ID=request.getParameter("course_id").toString();
		*/
		/*HttpSession session=request.getSession();
		LoggerInfo loggerInfo=(LoggerInfo)session.getAttribute("loggerInfo");
		loggerInfo=SignUpDao.checkLogin(userName);
		session.setAttribute("loggerInfo", loggerInfo);*/
		
		/*uploadassignmentBean bean=uploadAssignmentDao.getdetail();
		request.setAttribute("assignment_que1", bean.getQue1());
		request.setAttribute("assignment_que2", bean.getQue2());
		request.setAttribute("assignment_que3", bean.getQue3());
		request.setAttribute("assignment_que4", bean.getQue4());
		request.setAttribute("assignment_que5", bean.getQue5());
		request.setAttribute("assignment_que6", bean.getQue6());
		request.setAttribute("assignment_que7", bean.getQue7());
		request.setAttribute("assignment_que8", bean.getQue8());
		
		
		
		
		
		RequestDispatcher rd = request.getRequestDispatcher("uploadAssignment.jsp");
	    rd.forward(request, response);*/
		
		
		
	}

}
