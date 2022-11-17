<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id= "Emp" class="member.Employee"/>
<jsp:setProperty name ="Emp" property="*"/>


<%
	String employee_id = request.getParameter("employee_id");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Class.forName("oracle.jdbc.OracleDriver");

	Connection conn = null;
	Statement st = null;
	ResultSet rs = null;
	
	try{
	String url = "jdbc:oracle:thin:@localhost:1521:xe";  //오라클 연결 url
	String id = "c##hr"; //오라클 내 사용자명
	String pw = "hr";    // 오라클 내 사용자(id)의 비밀번호..  그 다음에 드라이버매니저 불러야 한다고 했던거 같은데 
	
	
	conn = DriverManager.getConnection(url,id,pw);
	st = conn.createStatement();
	
	String sql = "select * from employees where employee_id = "+ employee_id;

	rs = st.executeQuery(sql);
	if(rs.next()){
%>

<% Emp.setEmployee_id(rs.getString("employee_id")); %>
<% Emp.setFirst_name(rs.getString("first_name")); %>
<% Emp.setSalary(rs.getString("salary")); %>


<%--

<table border="1">
<tr>
	<td>아이디</td><td><%=rs.getString("Emp.getEmployee_id") %></td>
</tr>
<tr>
	<td>이름</td><td><%=rs.getString("Emp.getFirst_name") %></td>
<tr>
	<td>연봉</td><td><%=rs.getString("Emp.getSalary") %></td>
</tr>
	
</table>
 --%>

<table border="1">
<tr>
	<td>아이디22</td><td><%=employee_id %></td>
	<td>아이디</td><td></td>
</tr>
<tr>
	<td>이름</td><td><jsp:getProperty name = "Emp" property = "first_name"/></td>
</tr>	
<tr>
	<td>연봉</td><td><jsp:getProperty name = "Emp" property = "salary"/></td>
</tr>
	
</table>
<% 
	} else {
%>
<%= rs.getString("employee_id") %>에 해당하는 정보가 존재하지 않습니다.
<%
		}
	} catch(SQLException ex){
%>			
에러 발생:<%=ex.getMessage() %>
<%
	}finally{
		if(rs !=null) try{rs.close();} catch(SQLException ex){}
		if(st != null) try{st.close();} catch(SQLException ex){}
		if(conn != null) try {conn.close();} catch(SQLException ex) {}
	}
%>	



</body>
</html>