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
<h1>입력페이지</h1>
<form action="" method="post">
<!-- action 값이 없으면 현재 페이지 갱신 but 파라미터는 전달 -->
<!-- form 전달은 name으로 -->
<p><label for="sabun">sabun : </label><input type="text" name="sabun" id="sabun" /> </p>
<p><label for="name">name : </label><input type="text" name="name" id="name" /> </p>
<p><label for="pay">pay : </label><input type="text" name="pay" id="pay" /> </p>
<p><button type="submit">입 력</button> </p>
<!-- form>button 1개면 자동으로 submit button -->
</form>
</body>
</html>