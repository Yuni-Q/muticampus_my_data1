<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test01_a.jsp</title>
</head>
<body>
	<h1>�̰��� test01_a.jsp�� ���� ȭ���Դϴ�.</h1>
	
	<%
		response.sendRedirect("test01_b.jsp");
	%>
	
</body>
</html>