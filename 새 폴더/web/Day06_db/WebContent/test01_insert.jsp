<%@page import="dao.BookDao"%>
<%@page import="vo.BookVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test01_insert.jsp</title>
</head>
<body>

	<%
	
	 request.setCharacterEncoding("euc-kr");
	 String title = request.getParameter("title");
	 String publisher = request.getParameter("pub");
	 String priceStr = request.getParameter("price");
	 String year = request.getParameter("year");
	 
	 //파라미터는 무조건 다 String 자료형으로 인식하므로,
	 //숫자 데이터로 변환하는 작업이 필요함.
	 int price = Integer.parseInt(priceStr);
	 
	 //여러개의 값을 하나의 VO 객체에 모으기.
	 BookVO book = new BookVO(title,publisher,price,year);
	 
	 //데이터베이스에 insert하라고 전달
	 BookDao dao = new BookDao();
	 int result = dao.insert(book);
	
	%>
	
	책 추가 결과 : <%=result %>
	<a href="http://localhost:9999/Day06_db/">[메인으로]</a>

</body>
</html>