<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="displayError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student registration page</title>
<link rel="stylesheet" type="text/css" href="css/style.css" media="screen" />
</head>
<body>
<div id="page-wrap">
	<div id="welcome">
	<h3>Welcome at <span class="logob">Moby</span><span class="logo">us</span>.</h3>
	</div>
	<form action="register" onsubmit="return validateForm()" method="post">
		<label id="namelb">Fist Name:</label> <input type="text" id="inpname" name="firstName"><br>		
		<label id="namelb2">Last Name:</label> <input type="text" id="inpname2" name="lastName">
		<input type="submit" value="Submit">
	</form>
</div>
<footer><p id="datef"></p></footer>
<script type='text/javascript' src='scripts/myscript.js' ></script>
</body>
</html>