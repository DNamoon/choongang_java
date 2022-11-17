<%@ tag body-content="empty" pageEncoding="utf-8" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ tag dynamic-attributes="optionMap" %>
<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>


<c:forEach items="${optionMap}" var="option">
	<input type = "checkbox" name ="${option.key}">${option.value
	}</input>
</c:forEach>
