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
	<h1>�̰��� test02_b.jsp�� ���� ȭ���Դϴ�.</h1>
	
	<%
	
		String msg = (String)request.getAttribute("msg");
		Date time = (Date)request.getAttribute("requestTime");
	
	%>
	test_a.jsp�� ����س��� ������<br>
	msg : <%=msg %><br>
	��û�ð� : <%=time %><br>
</body>
</html>