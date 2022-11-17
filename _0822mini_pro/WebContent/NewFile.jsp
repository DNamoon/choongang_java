<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
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
			<td>이름</td><td><%=rs.getString("name")%></td>
			<td>내용</td><td><%=rs.getString("text")%></td>
		</tr>			
			
	<% }%>
	</table>>
바디가 있으니까 내용이라도 나와야 하는데 오류도 아니고 404에러면 페이지가 없다는건데
</body>
</html>