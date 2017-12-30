package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Modal.ProjectStore;

@WebServlet("/ProjectController")
public class ProjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("USERNAME");
		String password = request.getParameter("PASSWORD");

		System.out.println("NAME : "+name);
		System.out.println("PASSWORD : "+password);

		ProjectStore s=new ProjectStore();
		boolean loginStatus = false;
			try {
				loginStatus = s.projectlogin(name, password);
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			
		if(loginStatus == true){
			request.setAttribute("name", name);
			request.setAttribute("password", password);

			//Set the value in session
			HttpSession  hs = request.getSession();
			hs.setAttribute("sesssionName", name);
			hs.setAttribute("sesssionpassword", password);

			
			
			RequestDispatcher rd= request.getRequestDispatcher("enterprojectlibrary.jsp");
			rd.forward(request, response);
			
		}else
		{
			RequestDispatcher rd= request.getRequestDispatcher("Authenticationfailed.jsp");
			rd.forward(request, response);
		}
			
		
		
	}

	
	
	

	
	}


