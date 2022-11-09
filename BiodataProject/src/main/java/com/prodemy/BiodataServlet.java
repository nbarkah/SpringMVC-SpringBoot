package com.prodemy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formlatihan")
public class BiodataServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		String nim = req.getParameter("nim");
		String nama = req.getParameter("nama");
		String alamat = req.getParameter("alamat");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<table border=1>");
		out.println("Submit data anda<br>");
		out.println("<tr>");
		out.println("<td>");
		out.println("ID : "+ id + "<br>");
		out.println("</td>");
		out.println("</tr>");
		out.println("NIM : "+ nim + "<br>");
		out.println("Nama : "+ nama + "<br>");
		out.println("Alamat : "+ alamat + "<br>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
