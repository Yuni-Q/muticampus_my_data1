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
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
	
		if((id.equals("admin")) && (pw.equals("1234"))){
			out.write("로그인에 성공하셨습니다.<br>");
				
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			
			
		
	
	%>
	<%		
			
		}else{
			out.write("로그인에 실패하셨습니다.");
		}
	%>
		<br>	
		<a href="login_status.jsp">로그인 상태 확인하기 !!</a><br>
		<a href="login_form.jsp">로그인 폼으로 돌아가기</a>
</body>
</html>