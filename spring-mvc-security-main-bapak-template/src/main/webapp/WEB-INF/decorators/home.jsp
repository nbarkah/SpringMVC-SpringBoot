<%
	request.setAttribute("contextName",request.getContextPath());
%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<link href="<%=request.getContextPath() %>/resources/theme1/regis.css" rel="stylesheet">
<!DOCTYPE html>
<!-- this is from home.jsp decorator //-->
<html>
<head>
	<title>Prodemy - <decorator:title/></title>
</head>
<body>
	<p>Welcome to Spring MVC (This is home)</p>
	<div>
		<decorator:body/>
	</div>
</body>
</html>
