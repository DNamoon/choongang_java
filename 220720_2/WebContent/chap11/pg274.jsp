<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="util.CalUtil"%>
<%@ taglib prefix = "c" uri= "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<Long> lst = Arrays.asList(1L,2L,5L,10L);
	request.setAttribute("list",lst);
	long sum = CalUtil.sum(lst);
%>

<c:set var = "list22" value = "<%=lst%>"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
${CalUtil.sum(list)}<br/>
${list22}<br/>
<%=sum %>
</body>
</html>