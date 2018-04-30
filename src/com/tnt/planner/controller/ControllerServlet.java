package com.tnt.planner.controller;

import com.tnt.planner.bean.LoginBean;
import com.tnt.planner.bean.Request;

import java.io.IOException;  
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;  

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet({ "/ControllerServlet", "/getAction", "/plan", "/login" })
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerServlet() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");    
        String url = request.getRequestURL().toString();
        //System.out.println(url);
        String action = url.split("/")[url.split("/").length-1];
        System.out.println(action);
        ProcessRequest process = new ProcessRequest();
        ArrayList<Object> a = new ArrayList();
        System.out.println(a);
        if(action.equalsIgnoreCase("plan")) {
        	
        	a = process.processRequest(request);
        	request.setAttribute("result", a);
        }
        PrintWriter out=response.getWriter();  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        LoginBean bean=new LoginBean();  
        bean.setName(name);  
        bean.setPassword(password);  
        request.setAttribute("bean",bean);
        //boolean status=bean.validate();  
        

        //System.out.println(jsonString);  
        if(true){  
            RequestDispatcher rd=request.getRequestDispatcher("results.jsp");  
            rd.forward(request, response);  
        }  
        else{  
            RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");  
            rd.forward(request, response);  
        }  
	}

}
