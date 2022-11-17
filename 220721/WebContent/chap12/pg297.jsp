<%@page import="util.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<% Member member = new Member();%>
<c:set target="<%= member %>" property="name" value ="홍"/>
<c:set var="member" value = "<%=member.getName() %>"/>
<c:set var="mem" value = "<%=member %>"/>
<c:set var = "m" value ="<%=member %>"/>
<c:set target="${m}" property = "age" value="31"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSTL 실습</title>
</head>
<body>
<c:remove var="m"/>
${m.age}<br/>
${member} <br/>
${mem.name} <br/>
<%=member.getName() %>
</body>
</html>