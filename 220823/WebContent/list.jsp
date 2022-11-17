<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.SQLException" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<body>

<%
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String jdbcDriver="jdbc:mysql://localhost:3306/jsptest?"+
						"userUnicode=true&characterEncoding=utf8";
	String dbUser="root";
	String dbPass="rootpw";
	String query = "select * from mini_pro" ;
	
	conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
	stmt = conn.createStatement();
	
	rs= stmt.executeQuery(query);
	
%>
	<table border="1">
		<tr>
			<td>아이디</td><td>이름</td><td>내용</td>
		</tr>
		<% while(rs.next()){ 
		%>
		<tr>			
			<td><%=rs.getInt("id")%></td>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("text")%></td>
		</tr>
		
	<% }%>
	</table>

</form>
</body>
<br/>
<form action = "form_input.jsp">
이름 : <input type="text" name="name"/> <br/>
하고 싶은 말 : <input type="text" name="text"/> <br/>
<input type="submit" value ="등록"/>
</form>

</body>
</html>