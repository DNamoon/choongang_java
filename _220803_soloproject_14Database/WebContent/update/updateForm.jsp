<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>이름 변경폼 mine</title>
</head>
<body>
<form action = "/_220803_soloproject_14Database/update/update.jsp" method = "post"> //경로 아직도 잘 모르나봐. 책에서는 /chap14/update/update.jsp
<table border="1">
	<tr>
		<td>아이디</td>
		<td><input type = "text" name = "memberID" size = "10"> </td>
		<td>이름</td>
		<td><input type = "text" name = "name" size = "10"> </td>
	</tr>
	<tr>
		<td colspan ="4"><input type="submit" value="변경"></td>
	</tr>
</table>
</form>

</body>
</html>