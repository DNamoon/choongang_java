<%@ tag body-content="tagdependent" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="test" %>
<jsp:doBody var = "${test}" />
<c:out value= "${test}" escapeXml="true" /> 
${test}