<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<div class="container" align="center">
		<p>${h1}</p>
		<h1>Hi ${users.username}, Welcome to Shopping Cart</h1>
		<h2>You have registered your email with ${users.email} and
			${users.password }</h2>
	</div>
</body>
</html>