<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="tf" tagdir="/WEB-INF/tags" %>

<html>
<head><title>sum 사용</title></head>
<body>
1)${sum}<br/>
<tf:sum begin="1" end="10">
1-10까지 합 : ${sum}   //sum 변수는 어디서 나왔을까? name-given에서! <br/>
</tf:sum>
2)${sum}
</body>
</html>