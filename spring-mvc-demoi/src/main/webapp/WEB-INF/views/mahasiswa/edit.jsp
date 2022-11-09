<!DOCTYPE web-app PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN" "http://java.sun.com/dtd/web-app_2_3.dtd" >
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
request.setAttribute("contextName", request.getContextPath());
%>
<html>
<body>
<head>
	<style type="./Assets.index.css"></style>
</head>
<div class="header">

	<h1>Welcome to Spring MVC Tutorial</h1>
</div>
	<div class="formMhs">
		<form action="${contextName}/mhs" method="post">
			<input type="hidden" name="mode" value="edit"> 
			<input type="hidden" name="id" value="${mahasiswa.id}">
			<table>
			<tr>
			<td>NIM</td><td>:	<input type="text" name="nim" value="${mahasiswa.nim}"></td>
			</tr>
			<tr>
			<td>Nama</td><td>:	<input type="text" name="nama" value="${mahasiswa.nama}"></td>
			</tr>
			<tr>
			<td>Alamat</td><td>:	<input type="text" name="domisili" value="${mahasiswa.alamat}"></td>
			</tr>
			<tr>
			<td><button type="submit">Simpan</button></td>
			
			</tr>
		
			</table>
			</form>
	</div>

	<div class="indexMhs">
	
	<table>
		
			<c:forEach var="mhs" items="${mhslist}">
				<tr>
				<td>	 ${mhs.nim} </td>
				<td> ${mhs.nama} </td>
				<td> <a	href="${contextName}/mhs/edit?id=${mhs.id}">Edit</a> </td>
				<td><form action="${contextName}/mhs" method="post">
						<input type="hidden" name="mode" value="hapus">	
						<input type="hidden" name="id" value="${mhs.id}">
						<button type="submit">Hapus</button>
						</form></td>
				</tr>
				
			</c:forEach>
	</table>
	</div>
</body>
</html>