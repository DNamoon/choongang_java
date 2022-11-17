<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="util.FormatUtil" %>    
<%
	request.setAttribute("price",123456789L);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL 함수 호출</title>
</head>
<body>
연봉은 <b>${FormatUtil.number(price,'#,##0')}</b>원 입니다.
</body>
</html>