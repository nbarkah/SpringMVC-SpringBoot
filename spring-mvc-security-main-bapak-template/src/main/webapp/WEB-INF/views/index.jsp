<!DOCTYPE web-app PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN" "http://java.sun.com/dtd/web-app_2_3.dtd" >
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
    request.setAttribute("contextName",request.getContextPath());
%>
<html>
<head>
<title>Login Page</title>
</head>
<body>
<header class="panel-heading text-center"> Sign in </header>
<c:if test="${param.error != null}">
							<div class="alert alert-danger">
Failed to login.
	<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null}">
Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" />
	</c:if>
							</div>
</c:if>
<c:url value="/login" var="loginUrl"/>
						<form action="${loginUrl}" method="post">
							<div class="block">
								<label class="control-label text-small">User ID</label> <input id="userid" name="userid" type="text" placeholder="User ID">
							</div>
							<div class="block">
								<label class="control-label text-small">Password</label> <input name="password" type="password" id="password" placeholder="Password">
							</div>
							<button type="submit" class="btn btn-info">Sign in</button>
						</form></body>
</html>
