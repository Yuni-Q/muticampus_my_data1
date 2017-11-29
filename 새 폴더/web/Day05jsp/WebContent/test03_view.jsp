<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test03_view.jsp</title>
</head>
<body>

	<h1>test03_view.jsp가 만든 결과 화면</h1>
	오늘의 메뉴 : <%=request.getAttribute("menu") %> <br>
	포워드서블릿이 뽑은 랜덤숫자 : <%=request.getAttribute("randomNum") %> <br>

</body>
</html>