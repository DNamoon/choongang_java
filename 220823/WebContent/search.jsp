<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.lang.NullPointerException" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>조회 페이지</title>
</head>
<body>

<c:if test="${errors.id}">찾는 방명록이 없습니다.</c:if>
<%
	String id=request.getParameter("id");
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String jdbcDriver="jdbc:mysql://localhost:3306/jsptest?"+
						"userUnicode=true&characterEncoding=utf8";
	String dbUser="root";
	String dbPass="rootpw";
	
	String query = "select * from mini_pro where id = '"+id+"'";
	
	conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
	stmt = conn.createStatement();
	
	rs= stmt.executeQuery(query);
	
	
%>
	<table border="1">
		<% while(rs.next()){ 
		%>
		<tr>
			<td>아이디</td><td><%=rs.getInt("id")%></td>
		</tr>
		<tr>			
			<td>이름</td><td><%=rs.getString("name")%></td>
		</tr>
		<tr>
			<td>내용</td><td><%=rs.getString("text")%></td>
		</tr>
	<% }%>
	</table>

<form action="main.jsp">
<br/>
<input type="submit" value="메인으로 돌아가기" />
</form>
</body>
</html>