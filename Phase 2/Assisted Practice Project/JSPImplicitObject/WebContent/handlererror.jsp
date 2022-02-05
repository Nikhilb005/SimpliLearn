<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Exception exception=new Exception();
exception.printStackTrace(response.getWriter()); %>
<br>
An exception was generated. Details are above:<br>
</body>
</html>