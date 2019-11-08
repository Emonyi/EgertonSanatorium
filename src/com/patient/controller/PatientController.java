package com.patient.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.user.dao.DaoController;
import com.patient.model.PatientModel;

/**
 * Servlet implementation class PatientController
 */

public class PatientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String regNo = request.getParameter("regNo");
		String gender = request.getParameter("gender");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		
		PatientModel model=new PatientModel(name, regNo, gender, mobile, email, age, new Date());
		
		DaoController controller = new DaoController();
		
		
		controller.addPatient(model);
		
		request.setAttribute("message", "details inserted into database successfully");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("PatientTest.jsp");
		dispatcher.forward(request, response);
		
	}

}
