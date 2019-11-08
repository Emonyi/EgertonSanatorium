package com.doctor.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctor.model.DoctorModel;
import com.user.dao.DaoController;

/**
 * Servlet implementation class DoctorController
 */

public class DoctorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorController() {
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
		String staff_id = request.getParameter("staff_id");
		String password = request.getParameter("password");
		
		DoctorModel doctorModel = new DoctorModel(name,staff_id,password, new Date());
		
		DaoController controller = new DaoController();
		
		controller.addDoctor(doctorModel);
		
		
		request.setAttribute("doctor", "Doctor added successfully");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("DoctorReg.jsp");
		dispatcher.forward(request, response);
		
	}

}
