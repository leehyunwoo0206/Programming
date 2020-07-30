<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로 그 인</title>
<link rel="stylesheet" type="text/css" href="CSS/header.css">
<link rel="stylesheet" type="text/css" href="CSS/common.css">
</head>
<body>
	<nav>
	<a href="main.html"><img src="images/logo.png" style="width: 300px; height: 150px"></a>
	</nav>
	<form action="loginPro.do" id="loginPage"method="post">
		<p>로 그 인</p>
		<input id="id" type="text" name="m_ID" required="required"><br>
		<input id="pass" type="password" name="m_PASSWD" required="required">
		<input class="button1" type="submit" value="로그인"><br>
		<input class="button2" type="button" value="ID/PW찾기" onclick="location.href='findidpw.jsp'">
		<input class="button2" type="button" value="회원가입" onclick="location.href='joinForm.jsp'">
	</form>
</body>
</html>