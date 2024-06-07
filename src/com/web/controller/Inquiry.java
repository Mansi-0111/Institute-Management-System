package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.bean.InquiryBean;
import com.web.bean.SignUpBean;
import com.web.dao.InquiryDao;
import com.web.dao.SignUpDao;

@WebServlet("/Inquiry")
public class Inquiry extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Inquiry() {
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
		//Integer inquiryid;
		String inquiryadd, inquirymail, inquiryname, inquiryquery;

		//inquiryid = Integer.parseInt(request.getParameter("inquiryid").toString());
		inquiryadd = request.getParameter("inquiryadd").toString();
		inquirymail = request.getParameter("inquirymail").toString();
		inquiryname = request.getParameter("inquiryname").toString();
		inquiryquery = request.getParameter("inquiryquery").toString();
		
		
		InquiryBean bean = new InquiryBean();
		//bean.setInquiryid(inquiryid);
		bean.setInquiryadd(inquiryadd);
		bean.setInquirymail(inquirymail);
		bean.setInquiryname(inquiryname);
		bean.setInquiryquery(inquiryquery);

		
		InquiryDao.Inquiry(bean);
		response.sendRedirect("index.jsp");
	}

}



 


		
