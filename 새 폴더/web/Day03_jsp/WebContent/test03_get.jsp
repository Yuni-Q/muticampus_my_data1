<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
		<title>test03_get.jsp</title>
	</head>
	<body>
		<h2>���� ���</h2>
		
		<a href="test03_form.jsp">[������ ���ư���]</a>
		<%
			request.setCharacterEncoding("euc-kr");
			String[] hobby = request.getParameterValues("hobby");
		 for(int i=0; i<hobby.length; i++){
		     out.println("������ �� : " + hobby[i] + "<br>");
		   }
		 	String gender = request.getParameter("gender");
		 	out.println("������ �� : " + gender + "<br>");
		%>


	</body>
</html>