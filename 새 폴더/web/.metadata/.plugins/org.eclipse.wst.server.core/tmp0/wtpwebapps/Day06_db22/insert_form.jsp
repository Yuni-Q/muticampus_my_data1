<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>insert_form.jsp</title>
</head>
<body>
	<form action="book.do" method="post">
		<input type="hidden" name="type" value="insert"> 
		<table>
			<tr>
				<td>å ����:</td>
				<td>
					<input type="text" name="title">
				</td> 
			</tr>
			<tr>
				<td>���ǻ�:</td>
				<td>
					<input type="text" name="pub">
				</td> 
			</tr>
			<tr>
				<td>����:</td>
				<td>
					<input type="text" name="price">
				</td> 
			</tr>
			<tr>
				<td>���ǳ⵵:</td>
				<td>
					<input type="text" name="year">
				</td> 
			</tr>
			<tr>
				<td colspan="2">
				<input type="submit" name="����"></td>
			
		</table>
	</form>
</body>
</html>