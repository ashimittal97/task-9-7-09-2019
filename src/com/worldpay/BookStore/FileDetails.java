package com.worldpay.BookStore;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/FileDetails")
public class FileDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		File file=new File("F:\\books\\");
		if(file.exists()){
			out.println("<html><body>");
			out.println("<h3>FILES</h3>");
			out.println("<hr>");
			for(String f:file.list()){
				out.println("<a href='FetchFiles?file="+f+"'>"+f+"</a><br>");
			}
			out.println("<hr>");
			out.println("<a href='index.jsp'>Back to home</a>");
	}

}
}