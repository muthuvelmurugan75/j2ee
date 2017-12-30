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

import com.Modal.Store;
import com.Modal.Store1;


@WebServlet("/Connnects")
public class MessageUtil1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		

		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String gmail = request.getParameter("gmail");

		
		System.out.println("NAme : "+name);
		System.out.println("Message : "+password);
		Store1 s=new Store1();
		boolean loginStatus = false;
			try {
				loginStatus = s.login(name, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			
		if(loginStatus == true){
			//pw.println("<h2 style ='color:green'>Authentication success</h2> for user : "+name);
			request.setAttribute("name", name);
			
			//Set the value in session
			HttpSession  hs = request.getSession();
			hs.setAttribute("sesssionName", name);
			
			
			RequestDispatcher rd= request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
			
		}else
		{
			pw.println("<h2>Authentication Failed</h2>");

		}
			
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println(" Hi i am post method....");
	}

}
