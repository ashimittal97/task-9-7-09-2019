package com.worldpay.BookStore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Search")
public class SearchBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Subject = request.getParameter("subjectBook");
		PrintWriter out = response.getWriter();

		try {
			Sqlutil.ConnectDB();

			String sqlsearch = "SELECT * FROM BOOKS WHERE SUBJECT = ";
			sqlsearch = sqlsearch + "'" + Subject + "'";
			java.sql.PreparedStatement PS = Sqlutil.ConnectDB().prepareStatement(sqlsearch);
			java.sql.ResultSet rs = PS.executeQuery();
			out.println("<html>");
			out.println("<html><body>");
			out.println("<h3>BOOK-DETAILS</h3>");
			out.println("<hr>");
			while (rs.next()) {
				int Book_id = rs.getInt(1);
				String Book_name = rs.getString(2);
				Subject = rs.getString(3);
				String Edition = rs.getString(4);
				int Price = rs.getInt(5);

				out.println("<table border=2>");
				out.println("<tr>");
				out.println("<td>BookId</td>");
				out.println("<td>" + Book_id + "</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>Book_Name</td>");
				out.println("<td>" + Book_name + "</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>Edition</td>");
				out.println("<td>" + Edition + "</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>Subject</td>");
				out.println("<td>" + Subject + "</td>");
				out.println("</tr>");
				out.println("<tr>");
				out.println("<td>Price</td>");
				out.println("<td>" + Price + "</td>");
				out.println("</tr>");
				out.println("</table>");
			}
			out.println("<hr>");
			out.println("</body></html>");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
