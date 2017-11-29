<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test02_b.jsp</title>
</head>
<body>
	<h1>이곳은 test02_b.jsp가 만든 화면입니다.</h1>
	
	<%
	
		String msg = (String)request.getAttribute("msg");
		Date time = (Date)request.getAttribute("requestTime");
	
	%>
	test_a.jsp가 기록해놓은 데이터<br>
	msg : <%=msg %><br>
	요청시간 : <%=time %><br>
</body>
</html>