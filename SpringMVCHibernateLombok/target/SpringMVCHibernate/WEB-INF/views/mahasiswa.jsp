<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Mahasiswa Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
</head>
<body>
<div class="w-25 p-3 mx-auto">
	<h1>Add a Mahasiswa</h1>
	<c:url var="addAction" value="/mahasiswa/add"></c:url>
	<form:form action="${addAction}" modelAttribute="mahasiswa">
		<c:if test="${!empty mahasiswa.nama}">
		  <div class="mb-3">
		    <form:label for="exampleInputEmail1" class="form-label" path="id">ID</form:label>
		    <form:input type="text" class="form-control" path="id" disabled="true"></form:input>
		    <form:hidden path="id" />
		  </div>
		</c:if>
	  
	  <div class="mb-3">
	    <form:label for="exampleInputPassword1" class="form-label" path="nim">NIM</form:label>
	    <form:input type="text" class="form-control" path="nim" placehoder="13011xxxxx"></form:input>
	  </div>
	  
	  <div class="mb-3">
	    <form:label for="exampleInputPassword1" class="form-label" path="nama">Nama</form:label>
	    <form:input type="text" class="form-control" path="nama" placehoder="Nama Lengkap"></form:input>
	  </div>
	  
	  <div class="mb-3">
	    <form:label for="exampleInputPassword1" class="form-label" path="alamat">Alamat</form:label>
	    <form:input type="text" class="form-control" path="alamat" placehoder="Kab/Kota"></form:input>
	  </div>
	  
	  <td colspan="2">
	  	<c:if test="${!empty mahasiswa.nama}">
		<input class="btn btn-primary" type="submit"
		value="<spring:message text="Edit Mahasiswa"/>" />
		</c:if>
		<c:if test="${empty mahasiswa.nama}">
		<input class="btn btn-primary" type="submit"
		value="<spring:message text="Add Mahasiswa"/>" />
		</c:if>
	  </td>

	</form:form>

	</div>
	<br>
	<div class="w-75 p-3 mx-auto">
	<h3>Mahasiswas List</h3>
	<c:if test="${!empty listMahasiswas}">
		<table class="table">
			<tr>
				<th scope="col">Number</th>
				<th scope="col">ID</th>
				<th scope="col">Nim</th>
				<th scope="col">Nama</th>
				<th scope="col">Alamat</th>
				<th scope="col">Prodi</th>
				<th scope="col">Action</th>
			</tr>
			<% int count = 1; %>
			<c:forEach items="${listMahasiswas}" var="mahasiswa">
				<tr>
				<% request.setAttribute("count", count); %>
					<td><c:out value="${count }"/></td>
					<td>${mahasiswa.id}</td>
					<td>${mahasiswa.nim}</td>
					<td>${mahasiswa.nama}</td>
					<td>${mahasiswa.alamat}</td>
					<c:forEach items="${mahasiswa.prodi}" var="p">
					<td>${p.nama}</td>
					</c:forEach>
					<td><a href="<c:url value='/edit/${mahasiswa.id}' />"class="btn btn-primary">Edit</a> 
					<a href="<c:url value='/remove/${mahasiswa.id}' />"class="btn btn-danger">Delete</a></td>
				</tr>
				<% count++; %>
			</c:forEach>
		</table>
	</c:if>
	</div>
</body>
</html>