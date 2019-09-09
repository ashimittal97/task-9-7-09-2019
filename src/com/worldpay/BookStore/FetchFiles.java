package com.worldpay.BookStore;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FetchFiles")
public class FetchFiles extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FetchFiles() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String filename = request.getParameter("file");
		File file = new File("F:\\books\\");

		for (String s : file.list()) {
			if (s.equals(filename)) {
				FileInputStream fis = new FileInputStream(file + "\\" + s);
				ServletOutputStream sos = response.getOutputStream();
				int a;
				while ((a = fis.read()) != -1) {
					sos.write(a);
					sos.flush();
				}
				byte b[] = new byte[fis.available()];
				fis.read();
				fis.close();
				sos.close();
			}

		}
	}
}
