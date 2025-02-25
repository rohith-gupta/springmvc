<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DisplayName</title>
</head>
<body>

<% 

String Name =  (String)request.getAttribute("name");

%>

<h1> Hello <%=Name %></h1>
<!-- getting data from controller to views using getAttribute   -->

</body>
</html>