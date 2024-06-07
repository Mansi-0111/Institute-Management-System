package com.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bean.LoggerInfo;
import com.web.bean.AppConstant;
import com.web.dao.SendMail;
import com.web.dao.SignUpDao;

/**
 * Servlet implementation class forgotPassword
 */
@WebServlet("/forgotPassword")
public class forgotPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forgotPassword() {
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
		
		String email = request.getParameter("email").toString();
		System.out.println("Email . "+email);
		LoggerInfo info = SignUpDao.checkLogin(email);
		
		
		
		String body = "Dear "+info.getUserName()+", Your password is : "+info.getUserPassword();
	    SendMail.send(AppConstant.fromEmail,AppConstant.fromPaassword,email,AppConstant.forgotPassword,body);  

	    request.setAttribute("forgotPassword", "Password sent to your entered email address.");
	    RequestDispatcher rd = request.getRequestDispatcher("forgotpsd.jsp");
	    rd.forward(request, response);
	}


	}


