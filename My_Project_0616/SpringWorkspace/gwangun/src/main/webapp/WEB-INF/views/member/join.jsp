<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>회원가입</h3>
<form method='post' action='joinRequest'>
<table border='1'>
<tr><th>성명</th>
	<td><input type='text' name='name' /></td>
</tr>
<tr><th>성별</th>
	<td><label><input checked type='radio' name='gender' value='남'/>남</label>
		<label><input type='radio' name='gender' value='여'/>여</label>
	</td>
</tr>
<tr><th>이메일</th>
	<td><input type='text' name='email'/></td>
</tr>
<tr><th>나이</th>
	<td><input type='text' name='age'/></td>
</tr>
</table><br>
<input type='submit' value='HttpServletRequest'/>
<input type='submit' value='@RequestParam'
	onclick='action="joinRequestParam"'/>
</form> 


</body>
</html>