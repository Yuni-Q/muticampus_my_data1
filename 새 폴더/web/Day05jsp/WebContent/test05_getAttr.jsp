<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String userName = (String) session.getAttribute("userName");
			out.write("���� ID:"+session.getId()+"<br>");
		if(userName!=null){
			out.write("���ǿ� ��ϵ� �̸�:<b>"+userName+"<b>");
			
		}else{
			out.write("<h3>���ǿ� ��ϵ� �̸��� �����ϴ�.</h3>");
		}
	%>
</body>
</html>