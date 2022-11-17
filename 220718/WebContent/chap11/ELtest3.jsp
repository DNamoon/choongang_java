<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
콤마와 점을 구분자로 사용:<br>
<c:forTokens var="token" items="빨강색,주황색.노란색.초록색,파랑색,남색.보라색" delims=",.">
${token}
</c:forTokens>

<h1> 구구단 4단</h1>
<ul>
<c:forEach var = "i" begin= "1" end = "9">

	<li>4 x ${i} = ${4*i}</li>
</c:forEach>
</ul>

<c:forEach var = "i" begin="2" end = "9">
	===================${i}단====================
	<c:forEach var = "j" begin = "1" end ="9">
	<li>${i} x ${j} = ${i*j}</li>
	</c:forEach>
</c:forEach>

<c:set var="intArray" value ='<%=new String[]{"가","나","다","라","마"} %>' />

<c:forEach var="i" items="${intArray}" begin="2" end="4" varStatus="status">
${status.index}-${status.count}-[${i}]<br>
</c:forEach>
<c:forEach var="i" begin="1" end="10" step="2">
${i}
</c:forEach>
</body>
</html>