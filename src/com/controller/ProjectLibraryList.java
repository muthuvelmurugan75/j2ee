package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modal.Store1;

@WebServlet("/ProjectLibraryList")
public class ProjectLibraryList extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				ArrayList t = null;
				Store1 s1=new Store1();
				try {
					 t = s1.getLibrarydetails();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			System.out.println(t.get(1));
			request.setAttribute("details", t);
				
			RequestDispatcher rd = request.getRequestDispatcher("librarymonitor.jsp");
			rd.forward(request, response);
				  
	
	}

	

}
