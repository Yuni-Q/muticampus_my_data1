<%@page import="vo.BookVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.BookDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test01_booklist.jsp</title>
</head>
<body>

		<%
		
			BookDao dao = new BookDao();
			List<BookVO> booklist = dao.selectAll(); //책 목록 조회
		
		%>
	
		<table border="1">
			<tr>
				<th>책 번호</th>
				<th>제목</th>
				<th>출판사</th>
				<th>가격</th>
				<th>출판년도</th>
			</tr>
			
			<% for(BookVO book : booklist){ %>
			<tr>
				<td><%=book.getBookNum() %></td>
				<td><%=book.getTitle() %></td>
				<td><%=book.getPublisher() %></td>
				<td><%=book.getPrice() %></td>
				<td><%=book.getYear() %></td>
			</tr>
			<% } %>
		
		</table>
		
		<a href="http://localhost:9999/Day06_db/">[메인으로]</a>
		
		
</body>
</html>