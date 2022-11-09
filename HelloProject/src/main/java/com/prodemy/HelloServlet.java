package com.prodemy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		out.println("<title>Profile</title>");
		out.println("<link rel=\"stylesheet\" href=\"tes.css\">");
		out.println("</head>");
		
		out.println("<body style=\"background:#8f8f8f\">");
		
			out.println("<h1>");
			out.println("<center>");
			out.println("<u>BIODATA SAYA</u>");
			out.println("</center>");
			out.println("</h1>");
		
			out.println("<center>");
			out.println("<h3>");
			out.println("<span><strong><marquee>Kenalan dulu kita guys!</marquee></strong></span>");
			out.println("</h3>");
			out.println("<img src=\"nb.jpg\" class=\"image\">");
			out.println("</center>");
		
			out.println("<br>");
			out.println("<hr>");
			
			out.println("<div>");
			out.println("<center>");
			out.println("<table border=\"3\" bgcolor=\"#B8B8B8\" width=\"30%\" height=\"30%\">");
				out.println("<tr>");
					out.println("<td>Nama</td>");
					out.println("<td>Nurhai Barkah</td>");
				out.println("</tr>");
				out.println("<tr>");
					out.println("<td>Domisili</td>");
					out.println("<td>Bandung</td>");
				out.println("</tr>");
				out.println("<tr>");
					out.println("<td>Asal Kampus</td>");
					out.println("<td>Telkom University</td>");
				out.println("</tr>");
				out.println("<tr>");
					out.println("<td>Jurusan</td>");
					out.println("<td>S1 Informatika</td>");
				out.println("</tr>");
				out.println("<tr>");
					out.println("<td>Github</td>");
					out.println("<td><a href=\"https://github.com/nbarkah\" target=\"_blank\">nbarkah</a></td>");
				out.println("</tr>");
				out.println("<tr>");
					out.println("<td>Linked In</td>");
					out.println("<td><a href=\"https://www.linkedin.com/in/nurhai-barkah-590077173/\" target=\"_blank\">Nurhai Barkah</a></td>");
				out.println("</tr>");
				out.println("<tr>");
					out.println("<td>Instagram</td>");
					out.println("<td><a href=\"https://www.instagram.com/nbarkah29\">nbarkah29</a></td>");
				out.println("</tr>");
			out.println("</table>");
			out.println("<h3 class=\"tess\">");
			out.println("#ProdemyPride");
			out.println("</h3>");
			out.println("</center>");
			out.println("</div>");
		
		out.println("</body>");
		
		out.println("</html>");
	}
}