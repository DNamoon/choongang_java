<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name","구씨");
%>
<%
	String st = request.getParameter("code");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL Object</title>
</head>
<body>
${cookie['ID'].value}<br/>
<hr>
요청 URI : ${pageContext.request.requestURI}<br>
request의 name 속성 : ${requestScope.name}<br>
code 파라미터 : ${param.code} <%=st %><br>

${name}

</body>
</html>