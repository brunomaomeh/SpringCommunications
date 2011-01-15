<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>

<fmt:setLocale value="pt_BR"/>
<c:set var="ctx">${pageContext.request.contextPath}</c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>Autorizador</title>
		<link href="${ctx}/css/autorizador.css" rel="stylesheet" type="text/css" media="screen" />
		<link href="${ctx}/css/displaytag.css" rel="stylesheet" type="text/css" media="screen" />
		<link href="${ctx}/css/smoothness/jquery-ui-1.8.custom.css" rel="stylesheet" type="text/css" />
	    <!--[if lt IE 7]>
	    <script src="http://ie7-js.googlecode.com/svn/version/2.0(beta3)/IE7.js" type="text/javascript"></script>
	    <![endif]-->
	    <script src='<c:url value="/js/jquery/jquery-1.4.2.min.js"/>'></script>
	    <script src='<c:url value="/js/jquery/jquery-ui-1.8.custom.min.js"/>'></script>
	    <script src='<c:url value="/js/jquery/jquery.ui.datepicker-pt-BR.js"/>'></script>
	    <script src='<c:url value="/js/jquery/jquery.hotkeys-0.7.9.min.js"/>'></script>
	</head>
	<body>
		<c:if test="false">
			<div id="headerWrap">
		    	<div id="headerContent">
		        </div><!-- header content -->
		    </div><!-- header wrap-->
	    </c:if>
	    <c:if test="${userInfo.loggedIn}">
		    <div id="userInfo">
		    	<p>${userInfo.user.login} - <a href="${ctx}/logout">Logout</a></p>
		    </div>
		    <div id="menuWrap">
		    	<ul id="menuElementsEn">
		    		<li>
		        		<a href="${ctx}/cartao/situacao/form"><span>Situação</span></a>
		        	</li>
		        	<li>
		        		<a href="${ctx}/monitoramento/form"><span>Monitoramento</span></a>
		        	</li>
		        	<li>
		        		<a href="${ctx}/cartao/extrato/form"><span>Extrato</span></a>
		        	</li>
		        	<li>
		        		<a href="${ctx}/relatorio/form"><span>Relatórios</span></a>
		        	</li>
		        </ul><!-- menuElements-->
		    </div><!-- menuWrap-->
	    </c:if>
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
		<div id="contentWrap">