<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="Error.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아이디 찾기 결과</title>
</head>
<body>
 <form action="loginForm.jsp" method="post">
	<c:if test="${result > 0}">
	    <center>고객님의 아이디는 ${m_id} 입니다 <p>
	    	<input type="submit" value="로그인"></center>
	 </c:if>
	</form>
	<c:if test="${result == 0}">
		<script type="text/javascript">
			alert("입력하신 정보가 다릅니다. 다시 작성해주세요");
			location.href = "idFindForm.jsp";
		</script>
	</c:if>
</body>
</html>