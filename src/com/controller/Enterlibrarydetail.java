package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modal.Store;

/**
 * Servlet implementation class Enterlibrarydetail
 */
@WebServlet("/Enterlibrarydetail")
public class Enterlibrarydetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String idnumber = request.getParameter("userid");
		String uname = request.getParameter("username");
		String bookname = request.getParameter("userbookname");
		String bookamount = request.getParameter("userbookamount");

		System.out.println("id : "+idnumber);
		System.out.println("name : "+uname);
		System.out.println("bookname : "+bookname);
		System.out.println("bookamount : "+bookamount);

		Store s=new Store();
		
		
			try {
				s.librarydetails(idnumber,uname,bookname,bookamount);
			} catch (ClassNotFoundException e) {
				// 
				e.printStackTrace();
			}
		
			RequestDispatcher rd= request.getRequestDispatcher("ProjectLibraryList");
			rd.forward(request, response);
			
	}
	
	}

	

