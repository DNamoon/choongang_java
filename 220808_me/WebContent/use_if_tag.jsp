<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>If 태그</title>
</head>
<body>
<c:if test = "true">
무조건 수행 <br/>
</c:if>

<c:if test = "${param.name == 'bk'}" var ="test">
name 파라미터는 ${param.name} 입니다. <br/>
${test}가 나올것인가.
</c:if>

<c:if test = "${18<param.age}">
당신의 나이는 18세 초과입니다.
</c:if>


</body>
</html>