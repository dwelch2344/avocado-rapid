<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>

<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ attribute name="head" required="false" fragment="true" %>
<%@ attribute name="footer" required="false" fragment="true" %>
<%@ attribute name="pageTitle" required="false" fragment="false" %>
<html lang="en">
<head>
    <title><c:if test="${not empty pageTitle}"><c:out value="${pageTitle}"/></c:if></title>
    <jsp:invoke fragment="head"/>
</head>
<%@ include file="/WEB-INF/views/header.jsp" %>
<jsp:doBody/>
<jsp:invoke fragment="footer"/>
<%@ include file="/WEB-INF/views/footer.jsp" %>
</body>
</html>