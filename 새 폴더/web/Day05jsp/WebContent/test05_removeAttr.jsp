<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test05_removeAttr</title>
</head>
<body>
	
	<%
		session.removeAttribute("userName");
		out.write("현재 세션에서 userName 속석을 삭제하였습니다.<br>");
	%>
	
	
</body>
</html>