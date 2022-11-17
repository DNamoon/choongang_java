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
	String expression = request.getParameter("expression");
	String result = request.getParameter("result");

	
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement pstmt= null;
	
	try{
	String jdbcDriver="jdbc:mysql://localhost:3306/guestbook?"+
						"userUnicode=true&characterEncoding=utf8";
	String dbUser="jspexam";
	String dbPass="jsppw";
	String query = "insert into calculator1 (expression, result) values(?,?)";
	
	conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
	pstmt = conn.prepareStatement(query);
	pstmt.setString(1,expression);
	pstmt.setString(2,result);
	
	pstmt.executeUpdate();
	
	} finally {
		JdbcUtil.close(pstmt);
	}
	
	//stmt = conn.createStatement();
	
	//rs= stmt.executeQuery(query);
	
%>

</form>
저장되었습니다. <br/>
<input type="button" value="돌아가기" onclick="/list.jsp" />
</body>
</html>