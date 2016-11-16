<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<style></style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body>
<h1>main page</h1>
<p>request attribute : ${msg }</p>
<p>request parameter : <%=request.getParameter("id") %></p>
<p><a href="Ex01.do">link</a></p>
<p>session : <%=session.getAttribute("msg2") %></p>
</body>
</html>