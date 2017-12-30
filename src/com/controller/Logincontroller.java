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

import com.Modal.Store1;

/**
 * Servlet implementation class Logincontroller
 */
@WebServlet("/Logincontroller")
public class Logincontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String password = request.getParameter("pword");
		String gmail = request.getParameter("Gmail");

		System.out.println("NAME : "+name);
		System.out.println("PASSWORD : "+password);
		System.out.println("GMAIL ID : "+gmail);

		Store1 s=new Store1();
		boolean loginStatus = false;
			try {
				loginStatus = s.login(name, password);
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			
		if(loginStatus == true){
			//pw.println("<h2 style ='color:green'>Authentication success</h2> for user : "+name);
			request.setAttribute("name", name);
			request.setAttribute("password", password);
			//request.setAttribute("gmail", gmail);

			//Set the value in session
			HttpSession  hs = request.getSession();
			hs.setAttribute("sesssionName", name);
			hs.setAttribute("sesssionpassword", password);

			
			
			RequestDispatcher rd= request.getRequestDispatcher("invite.jsp");
			rd.forward(request, response);
			
		}else
		{
			RequestDispatcher rd= request.getRequestDispatcher("Authenticationfailed.jsp");
			rd.forward(request, response);
		}
			
		
		
	}

	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
