<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아이디 찾기</title>
<link rel="stylesheet" href="CSS/spstyle.css" type="text/css">
</head>
<body>
<form action="idFindPro.do" method="post">
  <div class="a" align="center">
	<table class="table" >
		<th colspan="2">아이디 찾기</th>
		<tr><td></td></tr>
		<tr>
			<td>NAME</td>
			<td><input type="text" id="name" name="name" placeholder="이름을 입력해주세요" required="required"></td>
		</tr>
		<tr>
			<td>EMAIL</td>
			<td><input type="text" id="email" name="email" placeholder="이메일을 입력해주세요" required="required"></td>
		</tr>
		<td align="center" colspan="2"><input type="submit" value="아이디 찾기"></td>
	</table>
  </div>
</form>
</body>