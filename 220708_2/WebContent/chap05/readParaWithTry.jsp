<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>파라미터 출력</title>
</head>
<body>

name 파라미터 값:
<% try{ %>
<%=request.getParameter("name").toUpperCase() %>
<% } catch(Exception ex) { %>
name 파라미터가 올바르지 않습니다.
<%} %>

</body>
</html>