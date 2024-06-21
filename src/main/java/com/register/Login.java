package com.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Login extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail = req.getParameter("email11");
        String mypassword = req.getParameter("password11");
        
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/BATABASE_NAME","root","PASSWORD");
           
            String q = "select * from table1 where email = ? and password = ?";
            PreparedStatement psmt = conn.prepareStatement(q);
        	psmt.setString(1, myemail);
        	 psmt.setString(2, mypassword);
        	ResultSet rs =  psmt.executeQuery();
        	if(rs.next()) {
        		
        		HttpSession session = req.getSession();
        		session.setAttribute("session_name", rs.getString("name"));
        		
        		RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
        		rd.include(req, resp);
        		
        	}else {
        		
        		out.print("<h1 style='color:red'>Email and password didn't match</h1>");
				RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
				rd.include(req, resp);
			}
        	
        }catch (Exception e) {
			e.printStackTrace();
    		out.print("<h1 style='color:red'>"+e.getMessage()+"</h1>");
			RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
			rd.include(req, resp);
		}

	}

	
}
