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
		String userId = (String) session.getAttribute("id");
		String userPw = (String) session.getAttribute("pw");
		if(userId!=null){
			out.write("세션에 기록된 이름: <b>"+userId+"</b><br>");
			out.write("세션에 기록된 이름: <b>"+userPw+"</b><br>");
			session.invalidate();
	%>
	
	<% 	
		}else{
			out.write("<h3>세션에 기록된 이름이 없습니다.</h3>");
		}
	%>
			<a href="login_form.jsp">로그인 폼으로 돌아가기</a>
</body>
</html>