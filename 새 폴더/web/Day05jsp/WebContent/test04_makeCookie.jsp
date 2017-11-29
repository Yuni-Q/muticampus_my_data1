<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test04_makeCookie</title>
</head>
<body>
	<h1>이 서블릿은 쿠키를 만들어 발급하였습니다.</h1>
	
	<%
		Cookie cookie = new Cookie("cookie2","cookie2 value");
		cookie.setMaxAge(60*5);	
		response.addCookie(cookie);
	%>

</body>
</html>