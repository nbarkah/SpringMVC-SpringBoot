<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.sql.Connection" %>
    <%@ page import ="java.sql.DriverManager" %>
    <%@ page import ="java.sql.Statement" %>
    <%@ page import ="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
	<table border="1">
		<tr>
			<th>id</th>
			<th>nim</th>
			<th>nama</th>
			<th>alamat</th>
		</tr>
	<% 
		try {
			Class.forName("org.postgresql.Driver");        
	        Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "nb12345");
			Statement s = c.createStatement();
			
			String str = "SELECT * FROM mahasiswa";
			ResultSet rs = s.executeQuery(str);
			while(rs.next()){
			%>
			<tr>
				<td><%=rs.getString("mhs_id")%></td>
				<td><%=rs.getString("mhs_nim")%></td>
				<td><%=rs.getString("mhs_nama")%></td>
				<td><%=rs.getString("mhs_alamat")%></td>
			</tr>
			<% }
	
		} catch (Exception e) {
			
		}
	%>
		</table>
	<h3> Mau ngisi lagi mas/mbak ?</h3>
	<button> <a href="form.html"> Kesini kita </button>
	</center>
</body>
</html>