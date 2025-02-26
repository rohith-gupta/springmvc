<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>display2</title>
</head>
<body>

<%

String name = (String)request.getAttribute("name");

%>
<!-- Using Model and View Object from controller to view  -->
<h1>Hi, <%= name %> Your Login Has been Successful!!!!!</h1>

</body>
</html>