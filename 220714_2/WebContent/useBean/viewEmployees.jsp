<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "util.EmpDao" %>
<jsp:useBean id="emp" class = "util.Employees" scope = "request" />
<%
	EmpDao ed = new EmpDao();
	ed.connect();
	ed.getEmployees(100);
%>


<%--  되는거 확인 
<jsp:setProperty value ='<%=Integer.parseInt(request.getParameter("id"))%>' property="employee_id" name="emp"/>
<jsp:setProperty value ='<%=request.getParameter("name")%>' property="first_name" name="emp"/>
<jsp:setProperty value ='<%=request.getParameter("email")%>' property="email" name="emp"/>
<jsp:setProperty value ='<%=Integer.parseInt(request.getParameter("salary"))%>' property="salary" name="emp"/>
--%>


<%--
<%
	ed.getEmployees(Integer.parseInt(request.getParameter("id")));	
%>
 --%>

<%--
<%
emp.setFirst_name("test");
emp.setEmail("test@aaa.com");
emp.setSalary(4000);
emp.setEmployee_id(300);
%>
 --%>
<%--
<jsp:setProperty value ="100" property="employee_id" name="emp"/>
<jsp:setProperty value ="Steven" property="first_name" name="emp"/>
<jsp:setProperty value ="aaa@test.com" property="email" name="emp"/>
<jsp:setProperty value ="4000" property="salary" name="emp"/>
 --%>
 
 


 <%--
<jsp:setProperty value ="<%=emp.getEmployee_id()%>" property="employee_id" name="emp"/>
<jsp:setProperty value ="<%=emp.getFirst_name()%>" property="first_name" name="emp"/>
<jsp:setProperty value ="<%=emp.getEmail()%>" property="email" name="emp"/>
<jsp:setProperty value ="<%=emp.getSalary()%>" property="salary" name="emp"/>
 --%>
 <%--
<%emp.select2(); %>
  --%>

<%--
 <jsp:setProperty value ="<%=emp.getSalary()%>" property="salary" name="emp"/>
 --%>
 
 
 <%--
<jsp:setProperty property = "*" name = "emp" />
  --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>직원 정보</title>
</head>
<body>
<jsp:getProperty name="emp" property= "employee_id"/><br>
<jsp:getProperty name="emp" property= "first_name"/><br>
<jsp:getProperty name="emp" property= "email"/><br>
<jsp:getProperty name="emp" property= "salary"/><br>

</body>
</html>