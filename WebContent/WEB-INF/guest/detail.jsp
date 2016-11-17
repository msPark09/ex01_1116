<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="/ex01_1116/css/grid.css" />
<style></style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="grid12">
				<h1>상세보기</h1>
			</div>
		</div>
		<div class="row">
			<div class="grid4">사번 :</div>
			<div class="grid8">${bean.sabun }</div>
		</div>
		<div class="row">
			<div class="grid4">이름 :</div>
			<div class="grid8">${bean.name }</div>
		</div>
		<div class="row">
			<div class="grid4">날짜 :</div>
			<div class="grid8">${bean.nalja }</div>
		</div>
		<div class="row">
			<div class="grid4">금액 :</div>
			<div class="grid8">${bean.pay }</div>
		</div>
		<div class="row">
			<div class="grid12">
				<a href="./edit.do?idx=${bean.sabun }">수 정</a>
				<a href="./del.do?idx=${bean.sabun }">삭 제</a>
			</div>
		</div>


	</div>
</body>
</html>