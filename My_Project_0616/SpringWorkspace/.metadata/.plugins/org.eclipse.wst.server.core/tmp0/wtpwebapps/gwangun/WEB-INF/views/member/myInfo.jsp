<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원정보</h3>
<table border='1'>
<tr><th>성명</th><td>${name}</td></tr>
<tr><th>성별</th><td>${gender}</td></tr>
<tr><th>이메일</th><td>${email}</td></tr>
<tr><th>나이</th><td>${age}</td></tr>

</table><br>
<a href='member'>회원가입화면</a>

</body>
</html>