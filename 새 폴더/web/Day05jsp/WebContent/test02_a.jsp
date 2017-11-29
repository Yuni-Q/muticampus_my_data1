<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test01_a.jsp</title>
</head>
<body>
	<h1>test02_a.jsp가 만든 화면입니다.</h1>
	
	<%
	
		request.setAttribute("msg", "안녕하세요");
		request.setAttribute("requestTime", new Date());
	
	%>
	
	<jsp:forward page="test02_b.jsp"/>
	
	
		
</body>
</html>