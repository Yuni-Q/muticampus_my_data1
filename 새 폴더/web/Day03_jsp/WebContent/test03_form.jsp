<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test03_form.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

</head>
<body>

		<h1>click �̺�Ʈ</h1>
	<form action="test03_get.jsp" method="post">
		��� :
			<input type="checkbox" name="hobby"	value="���">���
			<input type="checkbox" name="hobby"	value="����">����
			<input type="checkbox" name="hobby"	value="����">����
		<p/>
		���� :
			<input type="radio" name="gender" value="����"/>����
			<input type="radio" name="gender" value="����"/>����
			
<br>
<br>
			<input type="submit" value="Ȯ��" id="checkBtn"/>
		
	

	
	</form>
</body>
</html>