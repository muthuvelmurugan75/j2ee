package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Modal.Store;


@WebServlet("/Connnect")
public class MessageUtil extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Welcome to java");
		
		String name = request.getParameter("name");
		String msg = request.getParameter("message");
		
		System.out.println("NAme : "+name);
		System.out.println("Message : "+msg);
		Store s=new Store();
		
		if(msg.equals("hi")){
			System.out.println("connection successful");
			
		}
			try {
				s.saveMsg(name, msg);
			} catch (ClassNotFoundException e) {
				// 
				e.printStackTrace();
			}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println(" Hi i am post method....");
	}

}
