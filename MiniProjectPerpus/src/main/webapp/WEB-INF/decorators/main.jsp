<%
	request.setAttribute("contextName",request.getContextPath());
%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<!DOCTYPE html>
<!-- this is from main.jsp decorator //-->
<html>
<head>
<link href="/resources/theme/css/regis.css" rel="stylesheet" type="text/css" />
	<title>Prodemy - <decorator:title/></title>
</head>
<body>
	<p>Welcome to Spring MVC ini ke 1</p>
	<div>
		<decorator:body/>
	</div>
</body>
</html>
