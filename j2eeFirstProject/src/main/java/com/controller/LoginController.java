package com.controller;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

import com.dao.UserDao;
import com.to.User;

/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
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
	
		RequestDispatcher requestDispatcher = null;
		try {
			
			User user = new User( request.getParameter("userid") , request.getParameter("password") , null );
			
			UserDao userDao = new UserDao();
			
			userDao.getUser(user);
			
			if(user.getStatus().equals("admin")) {
				requestDispatcher = request.getRequestDispatcher("Admin.jsp");
			}	
			
			else {
				requestDispatcher = request.getRequestDispatcher("User.jsp");
			}
			
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("user", user);
			requestDispatcher.forward(request, response);
			
			
		} catch (Exception e) {
			
			requestDispatcher = request.getRequestDispatcher("Login.jsp");
			request.setAttribute("message", e.getMessage());
			requestDispatcher.forward(request, response);
			
		}
		
	}
	
	
	
	
	

}
