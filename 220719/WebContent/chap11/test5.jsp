<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri= "http://java.sun.com/jsp/jstl/core"%>
<% 
	String someValue = "2004";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=
(someValue.compareTo("2004") == 0)
%>
<br/>
<c:set var="some" value="<%=someValue %>"/>
${some} <br/>
${some=='2004'}
<br/>
<br/>
<%--
${val = 1+3;'	a	' }
${val }
 --%>
</body>	
</html>