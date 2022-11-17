<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인 실패</title>
</head>
<body>
<%
	String id = request.getParameter("memberId");
	if(id !=null && id.equals("madvirus")){
		response.sendRedirect("/220706/chap03/index.jsp");
	}else {
%>
잘못된 아이디입니다.
<%
	}
%>

</body>
</html>