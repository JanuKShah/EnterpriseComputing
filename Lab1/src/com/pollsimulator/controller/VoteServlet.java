package com.pollsimulator.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pollsimulator.service.StudentService;



@WebServlet("/VoteServlet")
public class VoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public VoteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Long id = Long.parseLong(request.getParameter("id"));
		boolean voterNew = StudentService.register(id);
		if(voterNew)
		{
			boolean voteCasted=StudentService.castVote(request.getParameter("name"));
			if(voteCasted)
			{
				 HttpSession session = request.getSession(true);	    
				 session.setAttribute("message","Your vote has been casted successfully!"); 
			}
		}
		else
		{
			HttpSession session = request.getSession(true);	    
			session.setAttribute("message","Your vote had already been casted!"); 
		}
		response.sendRedirect("home.jsp");
	}

}
