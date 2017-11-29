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
			List<BookVO> booklist = dao.selectAll(); //å ��� ��ȸ
		
		%>
	
		<table border="1">
			<tr>
				<th>å ��ȣ</th>
				<th>����</th>
				<th>���ǻ�</th>
				<th>����</th>
				<th>���ǳ⵵</th>
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
		
		<a href="http://localhost:9999/Day06_db/">[��������]</a>
		
		
</body>
</html>