<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
%>${[1,2,3].stream().max().get()}
 -->
<%--
${[].stream().max().get()}
 -->
 --%>
 ${minValue = '-';''}
 ${[1,2,3].stream().min().orElse('없음') }
 
 ${[].stream().min().orElse("없음") }
</body>
</html>