<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>test04_viewCookies</title>
</head>
<body>

<%

	Cookie[] cookies = request.getCookies();
if(cookies != null && cookies.length>0){	
	for(Cookie c: cookies){
			out.write("쿠키이름:<b>"+c.getName()+"<b>");
			out.write("쿠키값:<b>"+c.getValue()+"<b>");
			out.write("<hr>");
	}
}
%>

</body>
</html>