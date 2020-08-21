package com.gettag.controller;


public class FrontController{

<<<<<<< HEAD
=======
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gettag.service.HandlerMapping;


/*@WebServlet("*.com")*/
public class FrontController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private HandlerMapping mappings=null;

	@Override
	public void service(HttpServletRequest request
					  , HttpServletResponse response
					  ) throws ServletException, IOException {
//		try {
//			String uri = request.getRequestURI();		
//			String context = request.getContextPath();	
//			uri = uri.substring(context.length());		
			
//			Controller controller = mappings.getController(uri);
	
//			String callPage = controller.handleRequest(request, response);
			
//			RequestDispatcher dispatcher
//				= request.getRequestDispatcher(callPage);
//			dispatcher.forward(request, response);
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new ServletException(e);
//		}
	}
>>>>>>> 2448bda50915897569cfad1104d8bf6b1f323336
}
			

	
