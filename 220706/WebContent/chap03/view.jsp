<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
request.setCharacterEncoding("utf-8");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//response.sendRedirect("test.jsp");
%>

<%
	String[] vv = request.getParameterValues("ddd");
	if(vv !=null){
	for(String ss: vv){
%>
	<%= ss %><br>
<%
	}
%>		
<%
	}
%>
<%= request.getParameter("sname") %>
<%= request.getParameter("addr") %>
</body>
</html>