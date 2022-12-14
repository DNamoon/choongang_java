<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>timeZone 태그 사용</title>
</head>
<body>
<%-- 
<c:forEach var="id" items="<%=java.util.TimeZone.getAvailableIDs() %>">
	${id} <br/> 
</c:forEach>
--%>
<c:set var = "now" value= "<%= new java.util.Date() %>" />
<fmt:formatDate value = "${now}" type="both" dateStyle="full" timeStyle="full" />

<br/>
<fmt:timeZone value="Canada">
<fmt:formatDate value="${now}" type="both"	dateStyle="full" timeStyle="full"/>
</fmt:timeZone>

</body>
</html>