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
	 
	 //�Ķ���ʹ� ������ �� String �ڷ������� �ν��ϹǷ�,
	 //���� �����ͷ� ��ȯ�ϴ� �۾��� �ʿ���.
	 int price = Integer.parseInt(priceStr);
	 
	 //�������� ���� �ϳ��� VO ��ü�� ������.
	 BookVO book = new BookVO(title,publisher,price,year);
	 
	 //�����ͺ��̽��� insert�϶�� ����
	 BookDao dao = new BookDao();
	 int result = dao.insert(book);
	
	%>
	
	å �߰� ��� : <%=result %>
	<a href="http://localhost:9999/Day06_db/">[��������]</a>

</body>
</html>