package com.pollsimulator.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pollsimulator.model.Candidate;
import com.pollsimulator.service.CandidateService;

/**
 * Servlet implementation class RegisterCandidateServlet
 */
@WebServlet("/RegisterCandidateServlet")
public class RegisterCandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegisterCandidateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Candidate c = new Candidate();
		c.setId(Long.parseLong(request.getParameter("id")));
		c.setName(request.getParameter("name"));
		boolean status = CandidateService.registerCandidate(c);
		if(status==true){
		  HttpSession session = request.getSession(true);	    
	      session.setAttribute("message","Candidate registered successfully"); 
	    }
		else {
			HttpSession session = request.getSession(true);	    
	        session.setAttribute("message","Candidate already registered"); 
		}
		response.sendRedirect("home.jsp"); 	
	}

}
