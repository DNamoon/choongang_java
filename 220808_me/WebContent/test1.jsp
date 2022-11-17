<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setAttribute("code","장마");
%>
<c:set var="die" value = "다이아몬드" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
나왔으면 좋겠다. ${die} 안 나오네 <br/>
${requestScope.code} 이건 나와?<br/>
${code}</br>
${param.code}</br>
${var1=10}<br/>
이건 나올까? 파람 속성 언제 쓰는지 실험중 ${param.when} <-여기에 있어야 함. 언제.
<br/>
${han=['가','나','다'};0} 
${han[2]}
</body>
</html>