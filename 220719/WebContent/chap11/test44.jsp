<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "myfunc" uri =  "/WEB-INF/tlds/el-functions.tld" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var = "mem" value = '${{'name':'홍길동', 'age' :20}}"/>
<c:set var = "vals" values = '${[1,2,5,3] }' />
${myfunc:sum([4,5,6,7]) }
</body>
</html>