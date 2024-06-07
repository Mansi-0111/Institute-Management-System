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
import com.web.dao.OnlinePaymentId;
import com.web.dao.PaymentTractionDao;

/**
 * Servlet implementation class onlinePayment
 */
@WebServlet("/onlinePayment")
public class onlinePayment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public onlinePayment() {
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
//		pageType = 1 : Node Page;
		/*pagetype=2 : Java*/
		/*pagetype = 3 : c&c++*/
		int amount = Integer.parseInt(request.getParameter("amount").toString());
		int pageType = Integer.parseInt(request.getParameter("pageType").toString());
		String orderId = OnlinePaymentId.getOrderId(amount);
		request.setAttribute("orderId", orderId);
		request.setAttribute("amount", amount);

		HttpSession session = request.getSession();
		LoggerInfo loggerInfo = (LoggerInfo)session.getAttribute("loggerInfo");

		if(pageType == 1){
			PaymentTractionDao.paymentTrancation("C&C++", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("c&c++.jsp");
			rd.forward(request, response);
		}
		if(pageType == 2){
			PaymentTractionDao.paymentTrancation("JAVA", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("java.jsp");
			rd.forward(request, response);
		}
		if(pageType == 3){
			PaymentTractionDao.paymentTrancation("Advance JAVA", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("advancejava.jsp");
			rd.forward(request, response);
		}
		if(pageType == 4){
			PaymentTractionDao.paymentTrancation("Python", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("pyhton.jsp");
			rd.forward(request, response);
		}
		if(pageType == 5){
			PaymentTractionDao.paymentTrancation("Php", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("php.jsp");
			rd.forward(request, response);
		}
		if(pageType == 6){
			PaymentTractionDao.paymentTrancation("Android", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("Android.jsp");
			rd.forward(request, response);
		}
		if(pageType == 7){
			PaymentTractionDao.paymentTrancation("IOS", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("ios.jsp");
			rd.forward(request, response);
		}
		if(pageType == 8){
			PaymentTractionDao.paymentTrancation("Photoshop", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("photoshop.jsp");
			rd.forward(request, response);
		}
		if(pageType == 9){
			PaymentTractionDao.paymentTrancation("Figma", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("figma.jsp");
			rd.forward(request, response);
		}
		if(pageType == 10){
			PaymentTractionDao.paymentTrancation("Illustrator", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("illustrator.jsp");
			rd.forward(request, response);
		}
		if(pageType == 11){
			PaymentTractionDao.paymentTrancation("Corel draw", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("coreldraw.jsp");
			rd.forward(request, response);
		}
		if(pageType == 12){
			PaymentTractionDao.paymentTrancation("Jquery", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("jquery.jsp");
			rd.forward(request, response);
		}
		if(pageType == 13){
			PaymentTractionDao.paymentTrancation("Html/css/javascript", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("hcj.jsp");
			rd.forward(request, response);
		}
		if(pageType == 14){
			PaymentTractionDao.paymentTrancation("Node", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("node.jsp");
			rd.forward(request, response);
		}
		if(pageType == 15){
			PaymentTractionDao.paymentTrancation("Angular", orderId, amount, loggerInfo.getUser_master_id());
			RequestDispatcher rd = request.getRequestDispatcher("angular.jsp");
			rd.forward(request, response);
		}
		
		
		
	}

}
