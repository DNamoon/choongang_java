<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>INFO</title>
</head>
<body>

<%
	String type = request.getParameter("type");
%>

<table width="100%" border="1" cellpadding="0" cellspacing = "0">
<tr>
	<td>제품번호</td><td>XXXX</td>
</tr>
<tr>
	<td>가격</td><td>10,000원</td>
</tr>
</table>

<jsp:include page="infoSub.jsp" flush="false">
	<jsp:param name="type" value="<%=type%>"/>
</jsp:include>


</body>
</html>