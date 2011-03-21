<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="/template/header.jsp" %> 

	<div align="center">
		<div id="container">
			<h1>
				Web-Service
			</h1>
			<form action="<c:url value="/webService/alteraValor"/>" name="form" method="post">
				<label for="valor">valor: </label> 
				<input id="valor" type="text" name="valor" value="${valor }" />
				<div align="right">
					<button type="submit" id="submit">Alterar Valor</button>
				</div>
			</form>
		</div>
	</div>
	
<%@ include file="/template/footer.jsp" %> 