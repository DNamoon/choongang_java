<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>choose 태그</title>
</head>
<body>

<c:set var="sum" value="0"/> 
<c:forEach var = "i" begin = "1" end ="10">
1부터 ${i}까지의 합은 ${sum = sum + i}입니다.<br>
${'총합 ' += sum}<br>
</c:forEach>

<c:choose>
	<c:when test = "${param.age >20 }">
	나이 20세 이상입니다.
	</c:when>
	<c:when test = "${param.name == 'bk' }">
	당신의 이름은 ${param.name}입니다.<br>
	<c:if test="${18<=param.age}">
	당신의 나이는 18세 이상입니다.
	</c:if>
	</c:when>
	<c:otherwise>
	모두 아닙니다.
	</c:otherwise>
</c:choose>



</body>
</html>