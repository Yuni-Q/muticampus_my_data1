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
	����� �̸� <b><%=name %></b> �� ���ǿ� ��ϵǾ����ϴ�.
	
</body>
</html>