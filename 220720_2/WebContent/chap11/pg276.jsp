<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>forEach인가?</title>
</head>
<body>
${list = [1,2,3,4,5]; sum1 = list.stream().sum()} <br/>
<hr>
<c:set var = "lst" value = "<%=java.util.Arrays.asList(1,2,3,4,5) %>"/>
<c:forEach var = "val" items = "${lst}">
	<c:set var = "sum" value = "${sum + val}"/>
</c:forEach>

${sum}

</body>
</html>