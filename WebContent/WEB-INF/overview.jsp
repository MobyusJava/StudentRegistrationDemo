<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="displayError.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Overview</title>
</head>
<body>
<h1>Hello ${student.firstName},</h1><br>
You are now registered as a student.<br>

<!-- using the functions to count number of students in the list -->
<c:if test="${fn:length(register)>1}">
	<h1>Please have a look at the list of co-students:</h1>
	<ol>
	<c:forEach var="s" items="${register}">
		<li>${s.firstName} ${s.lastName }</li>
	</c:forEach>
	</ol>
</c:if>
</body>
</html>