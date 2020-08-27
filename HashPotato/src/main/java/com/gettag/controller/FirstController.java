package com.gettag.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gettag.service.HandlerMapping;



public class FirstController extends HttpServlet{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HandlerMapping mappings = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {

		String configName = config.getInitParameter("configName");
		mappings = new HandlerMapping(configName);
	}
	
	@Override
	public void service(HttpServletRequest request
					  , HttpServletResponse response
					  ) throws ServletException, IOException {
		try {
			String uri = request.getRequestURI();		
			String context = request.getContextPath();	
			uri = uri.substring(context.length());		
			
			Controller controller = mappings.getController(uri); 
			
			String callPage = controller.handleRequest(request, response);
			
			RequestDispatcher dispatcher
				= request.getRequestDispatcher(callPage);
			dispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
