package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bean.FeedbackBean;
import com.web.bean.InquiryBean;
import com.web.dao.FeedbackDao;
import com.web.dao.InquiryDao;

@WebServlet("/Feedback")
public class Feedback extends HttpServlet {
private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Feedback() {
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
		System.out.println("Inside the Servlet");
		String description, feedbackemail, feedbackrate;

		//inquiryid = Integer.parseInt(request.getParameter("inquiryid").toString());
		description = request.getParameter("description").toString();
		feedbackemail = request.getParameter("feedbackemail").toString();
		feedbackrate = request.getParameter("feedbackrate").toString();
		
		
		
		FeedbackBean bean = new FeedbackBean();
		bean.setDescription(description);
		bean.setFeedbackrate(feedbackrate);
		bean.setFeedbackemail(feedbackemail);
	

		
		FeedbackDao.Feedback(bean);
		response.sendRedirect("index.jsp");
	}
	
}
