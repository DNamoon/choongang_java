<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setAttribute("MEMBERID","madviurs");
	session.setAttribute("NAME","최범균");
%>

<%
	String name = (String) session.getAttribute("NAME");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>세션에 정보 저장</title>
</head>
<body>

세션에 정보를 저장하였습니다.<br>

회원명: <%= name %>

</body>
</html>