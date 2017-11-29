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

		<h1>click 이벤트</h1>
	<form action="test03_get.jsp" method="post">
		취미 :
			<input type="checkbox" name="hobby"	value="등산">등산
			<input type="checkbox" name="hobby"	value="낚시">낚시
			<input type="checkbox" name="hobby"	value="수영">수영
		<p/>
		성별 :
			<input type="radio" name="gender" value="남자"/>남자
			<input type="radio" name="gender" value="여자"/>여자
			
<br>
<br>
			<input type="submit" value="확인" id="checkBtn"/>
		
	

	
	</form>
</body>
</html>