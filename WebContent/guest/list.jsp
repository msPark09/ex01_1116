<%@page import="com.hb.guest.model.GuestDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<style></style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body>
	<%
		ArrayList list = (ArrayList) request.getAttribute("list");
		for (int i = 0; i < list.size(); i++) {
			//System.out.println((Integer)list.get(i));
			//	HashMap map = (HashMap)list.get(i);
			//	System.out.println(map.get("sabun")+", ");
			//	System.out.println(map.get("name")+", ");
			//	System.out.println(map.get("nalja")+", ");
			//	System.out.println(map.get("pay")+", ");
			GuestDto dto = (GuestDto) list.get(i);
	%>
	<p>
		<%=dto.getSabun()%>,
		<%=dto.getName()%>,
		<%=dto.getNalja()%>,
		<%=dto.getPay()%>
		<%
			//	System.out.println(dto.getSabun());
				//	System.out.println(dto.getName());
				//	System.out.println(dto.getNalja());
				//	System.out.println(dto.getPay());
				//	out.print(dto.getSabun()+", ");
				//	out.print(dto.getName()+", ");
				//	out.print(dto.getNalja()+", ");
				//	out.print(dto.getPay()+"<br/>");
		%>
	</p>
	<%
		}
	%>
	<hr />
<p><a href="./add.do">add</a></p>
	<hr />
	<c:forEach items="${list }" var="dto">
		<p>${dto.sabun },${dto.name }, ${dto.nalja }, ${dto.pay }</p>

	</c:forEach>

</body>
</html>