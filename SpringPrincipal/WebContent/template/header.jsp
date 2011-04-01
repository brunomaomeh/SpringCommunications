<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<fmt:setLocale value="pt_BR"/>
<c:set var="ctx">${pageContext.request.contextPath}</c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link type="text/css" rel="stylesheet" href="${ctx}/css/springcommunication.css" />
		
		<script type="text/javascript" src="${ctx}/js/jquery/jquery-1.4.2.min.js"></script>
		<script type="text/javascript" src="${ctx}/js/spring_principal.js"></script>

		<title>SpringCommunication</title>
	</head>
	
	<body>
		<div id="menuWrap">
			<div align="left" style="float: left;">
				<a href="${ctx}">
					<img src="${ctx}/imagens/javace.png" alt="JavaCE" width="120px" style="border: 0px;" />
				</a>
			</div>
			<ul id="menuElementsEn">
				<li class="current">
					<a href="${ctx}/webService">Web-Service</a>
				</li>
				<li>
					<a href="${ctx}/filaDeMensagem">Fila de Mensagens</a>
				</li>
			</ul>
		</div>
    	
    	<div>
	    	<c:if test="${not empty errors}">
				<div id="errors">
					<ul>
						<c:forEach items="${errors }" var="error">
							<li>${error.message }</li>
						</c:forEach>
					</ul>
				</div>
			</c:if>
			<c:if test="${not empty notice}">
				<div id="notice">
					<p>${notice }</p>
				</div>
			</c:if>
    	</div>
	<div id="contentWrap">
</body>
</html>
