<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
<h1>Donuts</h1>
<c:forEach var="donut" items="${donuts}">
<ul>
<li><h3><a href="/details?id=${donut.getId()}">${ donut.getName() }</a></h3></li>
</ul>
</c:forEach>
</body>
</html>