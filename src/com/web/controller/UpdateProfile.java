package com.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.web.bean.LoggerInfo;
import com.web.dao.SignUpDao;
import com.web.dao.UpdateProfileDao;

/**
 * Servlet implementation class UpdateProfile
 */
@WebServlet("/UpdateProfile")
public class UpdateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProfile() {
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
		String userName, userContact, userAddress, userEmail;
		userName = request.getParameter("userName").toString();
		userContact = request.getParameter("userContact").toString();
		userAddress = request.getParameter("userAddress").toString();
		userEmail = request.getParameter("userEmail").toString();

		HttpSession session = request.getSession();
		LoggerInfo loggerInfo = (LoggerInfo)session.getAttribute("loggerInfo");
		UpdateProfileDao.updateProfile(userAddress, userContact, loggerInfo.getUser_master_id());

		LoggerInfo  loggerInfo1 = SignUpDao.checkLogin(loggerInfo.getUserEmail());
		session.setAttribute("loggerInfo", loggerInfo1);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
	    rd.forward(request, response);

	}

}
