<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.SQLException" %>    
<%@ page import="jdbc.JdbcUtil" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert JSP</title>
</head>
<body>


<%
	String name=request.getParameter("name");
	String text=request.getParameter("text");

	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement pstmt= null;
	
	try{
	String jdbcDriver="jdbc:mysql://localhost:3306/jsptest?"+
						"userUnicode=true&characterEncoding=utf8";
	String dbUser="root";
	String dbPass="rootpw";
	String query = "insert into mini_pro(name, text) values(?,?)";
	
	conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
	pstmt = conn.prepareStatement(query);
	pstmt.setString(1,name);
	pstmt.setString(2,text);
	
	pstmt.executeUpdate();
	
	} finally {
		JdbcUtil.close(pstmt);
	}
	
	//stmt = conn.createStatement();
	
	//rs= stmt.executeQuery(query);
	//<input type="button" value="돌아가기" onclick="location.replace('list.jsp')" />
%>

<form action="list.jsp">
등록되었습니다. <br/>
<input type="submit" value="돌아가기"/>
</form>
</body>
</html>