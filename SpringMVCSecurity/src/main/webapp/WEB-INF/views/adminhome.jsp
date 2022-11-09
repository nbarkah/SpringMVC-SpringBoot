<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
<title>Mahasiswa Page</title>
</head>
<body>
	<h1>Welcome admin</h1>
	<p>
		${message}<br /> <a href="${pageContext.request.contextPath}/mahasiswas">Click
			here to generate the Mahasiswa List</a><br />
	</p>
</body>
</html>