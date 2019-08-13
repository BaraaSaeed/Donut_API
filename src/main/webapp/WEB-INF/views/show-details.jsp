<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donut ${ donutDetails.getName() } details</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
<ul>
<li><h3>Name: ${ donutDetails.getName() }</h3></li>
<li><h3>Colaries: ${ donutDetails.getCalories() }</h3></li>
<li><h3> Extras:
	
	<c:forEach var="extra" items="${donutDetails.getExtras()}">
		<ul>
		<li><h4>${extra }</h4></li>
		</ul>
	</c:forEach>
	</h3></li>
</ul>
<p>
<img src="${donutDetails.getPhoto() }" height="250" width="250" >
</p>
<p><a href="/">Home</a></p>
</body>
</html>