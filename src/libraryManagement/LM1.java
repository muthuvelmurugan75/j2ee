package libraryManagement;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Modal.LMstore;
import com.Modal.Store1;


@WebServlet("/LM1")
public class LM1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name = request.getParameter("USERNAME");
		String password = request.getParameter("PASSWORD");

		System.out.println("NAME : "+name);
		System.out.println("PASSWORD : "+password);

		try {
			LMstore.project(name, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession  hs = request.getSession();
		hs.setAttribute("sesssionName", name);
		RequestDispatcher rd=request.getRequestDispatcher("register.jsp");
		rd.forward(request, response);
	}

}
