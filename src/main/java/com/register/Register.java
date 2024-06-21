package com.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email1");
		String mypassword = req.getParameter("password1");
		String mygender = req.getParameter("gender1");
		String mycity = req.getParameter("city1");
		
		
		// Check if email or password is empty or null
		if (myemail == null || myemail.trim().isEmpty() || mypassword == null || mypassword.trim().isEmpty()) {
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.print("<h3 style='color:red'>Email and Password are required fields!</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
            rd.include(req, resp);
            return; // Exit the method if validation fails
        }
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DATABASE_NAME","root","PASSWORD");
            String q = "insert into table1 values (?,?,?,?,?)";
            
            PreparedStatement psmt = conn.prepareStatement(q);
            psmt.setString(1, myname);
            psmt.setString(2,myemail);
            psmt.setString(3, mypassword);
            psmt.setString(4, mygender);
            psmt.setString(5, mycity);
            
            int count= psmt.executeUpdate();
            
            if(count>0) {
            	resp.setContentType("text/html");
            
            	PrintWriter out = resp.getWriter();
            	out.print("<h3 style='color:green'>User Register Successfully</h3>");
            	
            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
            rd.include(req, resp);
            }else {
            	resp.setContentType("text/html");
                
            	PrintWriter out = resp.getWriter();
            	out.print("<h3 style='color:red'>User Not Register Successfully</h3>");
            	
            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
            rd.include(req, resp);
            }
			
			
			
		} catch (Exception e) {
			  
	            e.printStackTrace();
	            resp.setContentType("text/html");
	            
            	PrintWriter out = resp.getWriter();
            	out.print("<h3 style='color:red'>Exception Occured: "+e.getMessage()+"</h3>");
            	
            RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
            rd.include(req, resp);

		}
		
		
	}
	

}
