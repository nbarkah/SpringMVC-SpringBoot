package com.prodemy;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formlatihan")
public class FormServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("id");
		String nim = req.getParameter("nim");
		String nama = req.getParameter("nama");
		String alamat = req.getParameter("alamat");
		
		try {    
	        Class.forName("org.postgresql.Driver");
	        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "nb12345");    
	        PreparedStatement ps = c.prepareStatement("INSERT INTO mahasiswa (mhs_id, mhs_nim, mhs_nama, mhs_alamat) VALUES (?,?,?,?);");
	        ps.setString(1, id);
	        ps.setString(2, nim);
	        ps.setString(3, nama);
	        ps.setString(4, alamat);
	        
	        int x =ps.executeUpdate();
//	        if(x > 0) {
//	        	out.println("ALHAMDULILLAH MASUK JUGA :)");
//	        }
	        
	        
	    } catch(Exception e) {    
	    	System.out.println("Tidak nyambung gan/sist ke postgreSQLnya:(");
	    }
		
		
		out.println("<html>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>PRINTNYA DISINI YA MAS/MBAK</h1>");
		out.println("<button> <a href=\"printview.jsp\"> Klik ini aja </button>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

		
	}

}
