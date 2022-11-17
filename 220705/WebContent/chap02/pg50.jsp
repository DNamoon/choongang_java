<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>HTML문서의 제목</title>
</head>
<body>
<%
    String bookTitle = "JSP 프로그래밍";
    String author = "최범균";
%>
<b><%= bookTitle %></b>(<%=author%>)입니다.
</body>
</html>