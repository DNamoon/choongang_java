<%@ tag body-content="scriptless" pageEncoding = "utf8" %>
<jsp:doBody var="content" scope="page" />
<%
	String content = (String)jspContext.getAttribute("content");
	content = content + "***";
%>
<%=content %>	
	<%--
	if(trim != null && trim.equals("true")){
		content = content.trim();
	}
	 --%>