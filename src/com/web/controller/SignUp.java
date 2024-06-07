package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bean.AppConstant;
import com.web.bean.SignUpBean;
import com.web.dao.OnlinePaymentId;
import com.web.dao.PaymentTractionDao;
import com.web.dao.SendMail;
import com.web.dao.SignUpDao;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
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
		Integer course_id;
		String user_addmissiondate, user_address, user_contact, user_dob, user_email, user_fname, user_gender, user_lname, user_parentcontact, user_parentemail, user_parentfname, user_parentlname, user_password;

		course_id = Integer.parseInt(request.getParameter("course_id").toString());
		user_address = request.getParameter("user_address").toString();
		user_contact = request.getParameter("user_contact").toString();
		user_dob = request.getParameter("user_dob").toString();
		user_email = request.getParameter("user_email").toString();
		user_fname=request.getParameter("user_fname").toString();
		user_gender = request.getParameter("user_gender").toString();
		user_lname = request.getParameter("user_lname").toString();
		user_parentcontact = request.getParameter("user_parentcontact").toString();
		user_parentemail = request.getParameter("user_parentemail").toString();
		user_parentfname = request.getParameter("user_parentfname").toString();
		user_parentlname = request.getParameter("user_lname").toString();
		user_password = request.getParameter("user_password").toString();
		
		SignUpBean bean = new SignUpBean();
		bean.setCourse_id(course_id);
		bean.setUser_address(user_address);
		bean.setUser_contact(user_contact);
		bean.setUser_dob(user_dob);
		bean.setUser_email(user_email);
		bean.setUser_fname(user_fname);
		bean.setUser_gender(user_gender);
		bean.setUser_lname(user_lname);
		bean.setUser_parentcontact(user_parentcontact);
		bean.setUser_parentemail(user_parentemail);
		bean.setUser_parentfname(user_parentfname);
		bean.setUser_parentlname(user_parentlname);
		bean.setUser_password(user_password);
		int userId = SignUpDao.signUp(bean);
		
		
		
		
		
		String body = "Dear student, Your Username is :"+bean.getUser_email()+", Your password is : "+bean.getUser_password();
	    SendMail.send(AppConstant.fromEmail,AppConstant.fromPaassword,bean.getUser_email(),"Registered successfully",body); 

		String orderId = OnlinePaymentId.getOrderId(500);
		PaymentTractionDao.paymentTrancation("Registration", orderId, 500, userId);
		
		response.sendRedirect("login.jsp");
	}

}
