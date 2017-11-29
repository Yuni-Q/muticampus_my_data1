<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test05_setAttr.jsp</title>
</head>
<body>
	
	<%
	
		String name  = request.getParameter("n");
		session.setAttribute("userName", name);
		
	
	%>
	당신의 이름 <b><%=name %></b> 이 세션에 기록되었습니다.
	
</body>
</html>